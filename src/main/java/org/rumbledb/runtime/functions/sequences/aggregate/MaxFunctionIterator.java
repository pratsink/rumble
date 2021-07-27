/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors: Stefan Irimescu, Can Berker Cikis
 *
 */

package org.rumbledb.runtime.functions.sequences.aggregate;

import org.apache.spark.api.java.JavaRDD;
import org.rumbledb.api.Item;
import org.rumbledb.context.DynamicContext;
import org.rumbledb.context.Name;
import org.rumbledb.exceptions.*;
import org.rumbledb.expressions.ExecutionMode;
import org.rumbledb.items.ItemComparator;
import org.rumbledb.items.ItemFactory;
import org.rumbledb.items.structured.JSoundDataFrame;
import org.rumbledb.runtime.AtMostOneItemLocalRuntimeIterator;
import org.rumbledb.runtime.RuntimeIterator;
import org.rumbledb.runtime.primary.VariableReferenceIterator;
import org.rumbledb.runtime.typing.CastIterator;
import org.rumbledb.types.BuiltinTypesCatalogue;
import org.rumbledb.types.ItemType;
import sparksoniq.spark.SparkSessionManager;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxFunctionIterator extends AtMostOneItemLocalRuntimeIterator {


    private static final long serialVersionUID = 1L;
    private RuntimeIterator iterator;
    private double currentMaxDouble;
    private float currentMaxFloat;
    private BigDecimal currentMaxDecimal;
    private long currentMaxLong;
    private Item currentMax;
    private byte activeType = 0; // 0 = unknown/init 1 = long, 2 = BigDecimal, 3 = float, 4 = long, 5 = anyURI, 6 =
    // String, 7 = other types (date types)
    private ItemType returnType;
    private Item result;
    private ItemComparator comparator;

    public MaxFunctionIterator(
            List<RuntimeIterator> arguments,
            ExecutionMode executionMode,
            ExceptionMetadata iteratorMetadata
    ) {
        super(arguments, executionMode, iteratorMetadata);
        this.iterator = this.children.get(0);
        this.comparator = new ItemComparator(
                false,
                new InvalidArgumentTypeException(
                        "Max expression input error. Input has to be non-null atomics of matching types",
                        getMetadata()
                )
        );
    }

    @Override
    public Item materializeFirstItemOrNull(DynamicContext context) {
        if (this.children.size() == 2) {
            String collation = this.children.get(1).materializeFirstItemOrNull(context).getStringValue();
            if (!collation.equals("http://www.w3.org/2005/xpath-functions/collation/codepoint")) {
                throw new DefaultCollationException("Wrong collation parameter", getMetadata());
            }
        }

        if (!this.iterator.isRDDOrDataFrame()) {
            this.iterator.open(context);
            while (this.iterator.hasNext()) {
                Item candidateItem = this.iterator.next();
                if (candidateItem.isNull()) {
                    continue;
                }
                ItemType candidateType = candidateItem.getDynamicType();
                // Manage all types and make sure comparison are correct
                switch (this.activeType) {
                    case 0:
                        // initialization, take whatever first type
                        if (candidateType.isSubtypeOf(BuiltinTypesCatalogue.longItem)) {
                            this.activeType = 1;
                            this.currentMaxLong = candidateItem.castToDecimalValue().longValue();
                        } else if (candidateType.isSubtypeOf(BuiltinTypesCatalogue.decimalItem)) {
                            this.activeType = 2;
                            this.currentMaxDecimal = candidateItem.castToDecimalValue();
                        } else if (candidateType.equals(BuiltinTypesCatalogue.floatItem)) {
                            this.activeType = 3;
                            this.currentMaxFloat = candidateItem.castToFloatValue();
                        } else if (candidateType.equals(BuiltinTypesCatalogue.doubleItem)) {
                            this.activeType = 4;
                            this.currentMaxDouble = candidateItem.castToDoubleValue();
                        } else if (candidateType.equals(BuiltinTypesCatalogue.anyURIItem)) {
                            this.activeType = 5;
                            this.currentMax = candidateItem;
                        } else if (candidateType.equals(BuiltinTypesCatalogue.stringItem)) {
                            this.activeType = 6;
                            this.currentMax = candidateItem;
                        } else if (
                            candidateType.equals(BuiltinTypesCatalogue.dayTimeDurationItem)
                                || candidateType.equals(BuiltinTypesCatalogue.yearMonthDurationItem)
                                || candidateType.equals(BuiltinTypesCatalogue.dateTimeItem)
                                || candidateType.equals(BuiltinTypesCatalogue.dateItem)
                        ) {
                            this.activeType = 7;
                            this.currentMax = candidateItem;
                        } else {
                            if (candidateType.equals(BuiltinTypesCatalogue.durationItem)) {
                                throw new InvalidArgumentTypeException(
                                        "Cannot compare " + this.returnType + " with " + candidateType,
                                        getMetadata()
                                );
                            }
                            this.activeType = 9;
                            this.currentMax = candidateItem;
                            // throw new OurBadException("Inconsistent state in state iteration");
                        }
                        this.returnType = candidateType;
                        break;
                    case 1:
                        // long
                        if (!candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare " + this.returnType + " with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (candidateType.isSubtypeOf(BuiltinTypesCatalogue.longItem)) {
                            long candidateItemLong = candidateItem.castToDecimalValue().longValue();
                            if (candidateItemLong > this.currentMaxLong) {
                                this.currentMaxLong = candidateItemLong;
                                this.returnType = candidateType;
                            }
                        }
                        if (candidateItem.isDecimal()) {
                            this.activeType = 1;
                            this.currentMaxDecimal = new BigDecimal(this.currentMaxLong);
                            BigDecimal candidateItemDecimal = candidateItem.getDecimalValue();
                            if (candidateItemDecimal.compareTo(this.currentMaxDecimal) > 0) {
                                this.currentMaxDecimal = candidateItemDecimal;
                                this.returnType = candidateType;
                            }
                        } else if (candidateItem.isFloat()) {
                            this.activeType = 3;
                            this.returnType = BuiltinTypesCatalogue.floatItem;
                            this.currentMaxFloat = this.currentMaxLong;
                            float candidateItemFloat = candidateItem.getFloatValue();
                            if (Float.isNaN(candidateItemFloat)) {
                                this.currentMaxFloat = Float.NaN;
                            } else if (candidateItemFloat > this.currentMaxFloat) {
                                this.currentMaxFloat = candidateItemFloat;
                            }
                        } else if (candidateItem.isDouble()) {
                            this.activeType = 4;
                            this.returnType = BuiltinTypesCatalogue.doubleItem;
                            this.currentMaxDouble = this.currentMaxLong;
                            double candidateItemDouble = candidateItem.getDoubleValue();
                            if (Double.isNaN(candidateItemDouble)) {
                                this.currentMaxDouble = Double.NaN;
                            } else if (candidateItemDouble > this.currentMaxDouble) {
                                this.currentMaxDouble = candidateItemDouble;
                            }
                        }
                        break;
                    case 2:
                        // decimal
                        if (!candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare decimal with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (candidateItem.isFloat()) {
                            this.activeType = 3;
                            this.returnType = BuiltinTypesCatalogue.floatItem;
                            this.currentMaxFloat = this.currentMaxDecimal.floatValue();
                            float candidateItemFloat = candidateItem.getFloatValue();
                            if (Float.isNaN(candidateItemFloat)) {
                                this.currentMaxFloat = Float.NaN;
                            } else if (candidateItemFloat > this.currentMaxFloat) {
                                this.currentMaxFloat = candidateItemFloat;
                            }
                        } else if (candidateItem.isDouble()) {
                            this.activeType = 4;
                            this.returnType = BuiltinTypesCatalogue.doubleItem;
                            this.currentMaxDouble = this.currentMaxDecimal.doubleValue();
                            double candidateItemDouble = candidateItem.getDoubleValue();
                            if (Double.isNaN(candidateItemDouble)) {
                                this.currentMaxDouble = Double.NaN;
                            } else if (candidateItemDouble > this.currentMaxDouble) {
                                this.currentMaxDouble = candidateItemDouble;
                            }
                        } else {
                            BigDecimal candidateItemDecimal = candidateItem.castToDecimalValue();
                            if (candidateItemDecimal.compareTo(this.currentMaxDecimal) > 0) {
                                this.currentMaxDecimal = candidateItemDecimal;
                                this.returnType = candidateType;
                            }
                        }

                        break;
                    case 3:
                        if (!candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare float with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (candidateItem.isDouble()) {
                            this.activeType = 4;
                            this.returnType = BuiltinTypesCatalogue.doubleItem;
                            this.currentMaxDouble = this.currentMaxFloat;
                            double candidateItemDouble = candidateItem.getDoubleValue();
                            if (Double.isNaN(candidateItemDouble) || candidateItemDouble > this.currentMaxDouble) {
                                this.currentMaxDouble = candidateItemDouble;
                            }
                        } else {
                            if (!Float.isNaN(this.currentMaxFloat)) {
                                float candidateItemFloat = candidateItem.castToFloatValue();
                                if (candidateItemFloat > this.currentMaxFloat) {
                                    this.currentMaxFloat = candidateItemFloat;
                                }
                            }
                        }

                        break;
                    case 4:
                        if (!candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare double with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (!Double.isNaN(this.currentMaxDouble)) {
                            double candidateItemDouble = candidateItem.castToDoubleValue();
                            if (candidateItemDouble > this.currentMaxDouble) {
                                this.currentMaxDouble = candidateItemDouble;
                            }
                        }
                        break;
                    case 5:
                        if (candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare anyURI with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (candidateItem.isString()) {
                            this.activeType = 6;
                            this.returnType = BuiltinTypesCatalogue.stringItem;
                        }
                        if (this.comparator.compare(candidateItem, this.currentMax) > 0) {
                            this.currentMax = candidateItem;
                        }
                        break;
                    case 6:
                        if (candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare string with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (this.comparator.compare(candidateItem, this.currentMax) > 0) {
                            this.currentMax = candidateItem;
                            this.returnType = candidateType;
                        }
                        break;
                    case 7:
                        if (!candidateType.equals(this.returnType)) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare " + this.returnType + " with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (this.comparator.compare(candidateItem, this.currentMax) > 0) {
                            this.currentMax = candidateItem;
                        }
                        break;
                    case 9:
                        if (candidateItem.isNumeric()) {
                            throw new InvalidArgumentTypeException(
                                    "Cannot compare " + this.returnType + " with " + candidateType,
                                    getMetadata()
                            );
                        }
                        if (this.comparator.compare(candidateItem, this.currentMax) > 0) {
                            this.currentMax = candidateItem;
                        }
                        break;
                    default:
                        throw new OurBadException("Inconsistent state in state iteration");
                }

            }

            this.iterator.close();

            Item itemResult;
            switch (this.activeType) {
                case 0:
                    return null;
                case 1:
                    itemResult = ItemFactory.getInstance().createLongItem(this.currentMaxLong);
                    break;
                case 2:
                    itemResult = ItemFactory.getInstance().createDecimalItem(this.currentMaxDecimal);
                    break;
                case 3:
                    itemResult = ItemFactory.getInstance().createFloatItem(this.currentMaxFloat);
                    break;
                case 4:
                    itemResult = ItemFactory.getInstance().createDoubleItem(this.currentMaxDouble);
                    break;
                case 5:
                case 6:
                case 7:
                case 9:
                    itemResult = this.currentMax;
                    break;
                default:
                    throw new OurBadException("Inconsistent state in state iteration");
            }
            return CastIterator.castItemToType(itemResult, this.returnType, getMetadata());

        }

        if (this.iterator.isDataFrame()) {
            JSoundDataFrame df = this.iterator.getDataFrame(context);
            if (df.isEmptySequence()) {
                return null;
            }
            df.createOrReplaceTempView("input");
            JSoundDataFrame maxDF = df.evaluateSQL(
                String.format(
                    "SELECT MAX(`%s`) as `%s` FROM input",
                    SparkSessionManager.atomicJSONiqItemColumnName,
                    SparkSessionManager.atomicJSONiqItemColumnName
                ),
                df.getItemType()
            );
            return itemTypePromotion(maxDF.getExactlyOneItem());
        }

        JavaRDD<Item> rdd = this.iterator.getRDD(context);
        if (rdd.isEmpty()) {
            return null;
        }
        this.result = rdd.max(this.comparator);
        return this.result;

    }

    public Map<Name, DynamicContext.VariableDependency> getVariableDependencies() {
        if (this.children.get(0) instanceof VariableReferenceIterator) {
            VariableReferenceIterator expr = (VariableReferenceIterator) this.children.get(0);
            Map<Name, DynamicContext.VariableDependency> result =
                new TreeMap<Name, DynamicContext.VariableDependency>();
            result.put(expr.getVariableName(), DynamicContext.VariableDependency.MAX);
            return result;
        } else {
            return super.getVariableDependencies();
        }
    }

    private Item itemTypePromotion(Item item) {
        if (item.isAnyURI()) {
            return ItemFactory.getInstance().createStringItem(item.getStringValue());
        }
        if (item.isFloat()) {
            return ItemFactory.getInstance().createDoubleItem(item.castToDoubleValue());
        }
        if (item.isDecimal()) {
            return ItemFactory.getInstance().createDoubleItem(item.castToDoubleValue());
        }
        return item;
    }
}

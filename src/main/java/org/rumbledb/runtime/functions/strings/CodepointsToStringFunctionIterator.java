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

package org.rumbledb.runtime.functions.strings;

import org.rumbledb.api.Item;
import org.rumbledb.exceptions.ExceptionMetadata;
import org.rumbledb.exceptions.IteratorFlowException;
import org.rumbledb.exceptions.UnexpectedTypeException;
import org.rumbledb.exceptions.CodepointNotValidException;
import org.rumbledb.items.ItemFactory;
import org.rumbledb.runtime.RuntimeIterator;
import org.rumbledb.runtime.functions.base.LocalFunctionCallIterator;
import sparksoniq.jsoniq.ExecutionMode;

import java.util.List;

public class CodepointsToStringFunctionIterator extends LocalFunctionCallIterator {

    private static final long serialVersionUID = 1L;

    public CodepointsToStringFunctionIterator(
            List<RuntimeIterator> arguments,
            ExecutionMode executionMode,
            ExceptionMetadata iteratorMetadata
    ) {
        super(arguments, executionMode, iteratorMetadata);
    }

    @Override
    public Item next() {
        if (this.hasNext) {
            List<Item> codepoints = this.children.get(0).materialize(this.currentDynamicContextForLocalExecution);

            StringBuilder stringBuilder = new StringBuilder();
            for (Item item : codepoints) {
                if (!(item.isInteger())) {
                    throw new UnexpectedTypeException(
                            "Integer item expected",
                            this.children.get(0).getMetadata()
                    );
                } else if (!(isValidCodePoint(item.getIntegerValue()))) {
                    throw new CodepointNotValidException(
                            "Non-XML-conformant codepoint: " + item.getIntegerValue(),
                            this.children.get(0).getMetadata()
                    );
                }
                stringBuilder.appendCodePoint(item.getIntegerValue());
            }
            this.hasNext = false;
            return ItemFactory.getInstance().createStringItem(stringBuilder.toString());
        } else
            throw new IteratorFlowException(
                    RuntimeIterator.FLOW_EXCEPTION_MESSAGE + " codepoints-to-string function",
                    getMetadata()
            );
    }

    private static boolean isValidCodePoint(int codepoint) {
        /* Checks if the codepoints are within the ranges allowed for in the XML 1.1 specification. */
        return 1 <= codepoint && codepoint <= 55295
            ||
            57344 <= codepoint && codepoint <= 65533
            ||
            65536 <= codepoint && codepoint <= 1114111;
    }
}

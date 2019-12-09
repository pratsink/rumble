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

package sparksoniq.spark.iterator.function;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import sparksoniq.exceptions.SparksoniqRuntimeException;
import sparksoniq.jsoniq.runtime.iterator.RDDRuntimeIterator;
import sparksoniq.jsoniq.runtime.iterator.RuntimeIterator;
import sparksoniq.jsoniq.runtime.metadata.IteratorMetadata;
import sparksoniq.semantics.DynamicContext;
import sparksoniq.spark.SparkSessionManager;

import java.util.List;

public class StructuredJsonFileFunctionIterator extends RDDRuntimeIterator {

    private static final long serialVersionUID = 1L;

    public StructuredJsonFileFunctionIterator(List<RuntimeIterator> arguments, IteratorMetadata iteratorMetadata) {
        super(arguments, iteratorMetadata);
    }

    @Override
    public boolean isDataFrame() {
        return true;
    }

    @Override
    public Dataset<Row> getDataFrame(DynamicContext context) {
        RuntimeIterator urlIterator = this._children.get(0);
        urlIterator.open(context);
        String fileName = urlIterator.next().getStringValue();
        urlIterator.close();
        try {
            return SparkSessionManager.getInstance()
                .getOrCreateSession()
                .read()
                .option("mode", "FAILFAST")
                .json(fileName);
        } catch (Exception e) {
            throw new SparksoniqRuntimeException(
                    "File "
                        + fileName
                        + " contains a malformed JSON document that does not fit into the JSON lines format.",
                    getMetadata().getExpressionMetadata()
            );
        }
    }
}

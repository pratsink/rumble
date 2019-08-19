/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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

package sparksoniq.jsoniq.runtime.iterator.primary;

import sparksoniq.exceptions.IteratorFlowException;
import sparksoniq.jsoniq.item.Item;
import sparksoniq.jsoniq.runtime.iterator.LocalRuntimeIterator;
import sparksoniq.jsoniq.runtime.metadata.IteratorMetadata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContextExpressionIterator extends LocalRuntimeIterator {

	private static final long serialVersionUID = 1L;

	public ContextExpressionIterator(IteratorMetadata iteratorMetadata) {
        super(null, iteratorMetadata);
    }

    @Override
    public Item next() {
        if (hasNext()) {
            this._hasNext = false;
            List<Item> results = new ArrayList<>();
            if (results.size() > 1)
                throw new IteratorFlowException("Invalid context item expression", getMetadata());
            return _currentDynamicContext.getVariableValue("$$").get(0);
        }
        throw new IteratorFlowException("Invalid next() call in Context Expression!", getMetadata());
    }

    public Set<String> getVariableDependencies()
    {
        Set<String> result = new HashSet<String>();
        result.add("$");
        return result;
    }
}

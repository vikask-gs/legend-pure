// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.runtime.java.compiled.serialization.model;


import org.eclipse.collections.api.list.MutableList;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;

public class Enum extends Obj
{
    public Enum(SourceInformation sourceInformation, String identifier, String classifier, String name, MutableList<PropertyValue> propertiesList)
    {
        super(sourceInformation, identifier, classifier, name, propertiesList);
    }

    public Enum(SourceInformation sourceInformation, String identifier, String classifier, String name)
    {
        super(sourceInformation, identifier, classifier, name);
    }
}
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.ait.lienzo.test.stub.overlays;

import com.ait.lienzo.test.annotation.StubClass;
import elemental2.dom.CSSStyleDeclaration;
import elemental2.dom.Element;

@StubClass("elemental2.dom.HTMLElement")
public class HTMLElement extends elemental2.dom.Element {

    public static String[] observedAttributes;
    public String className;
    public String dir;
    public boolean draggable;
    public boolean hidden;
    public String id;
    public String lang;
    public int offsetHeight;
    public int offsetLeft;
    public Element offsetParent;
    public int offsetTop;
    public int offsetWidth;
    public boolean spellcheck;
    public CSSStyleDeclaration style = new CSSStyleDeclaration();
    public int tabIndex;
    public String title;
}
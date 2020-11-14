/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tdosca.tc06;

import org.joda.time.LocalTime;
import de.tdosca.common.Tipster;

public class Greeter {

  Tipster tipster = new Tipster();
  String inc = "---";

  LocalTime currentTime = new LocalTime();

  public String speak(String garg) {
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": de.tdosca.tc06.Greeter(" + garg + "): 'hello'.");
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": license(Greeter,A.p.a.c.h.e-2.0)");
    tipster.speak();
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": de.tdosca.tc06.Greeter(...): 'bye bye'");
    return "back1";
  }
  public String speak() {
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": de.tdosca.tc06.Greeter(): 'hello'.");
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": license(Greeter,A.p.a.c.h.e-2.0)");
    tipster.speak();
    currentTime = new LocalTime();
    System.out.println(inc+currentTime+": de.tdosca.tc06.Greeter(): 'bye bye'");
    return "back0";
  }
}

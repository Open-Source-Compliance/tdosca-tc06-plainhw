/*
* Tipster.java of the project de.tdosca.tc06 is licensed under the terms
* of the BSD-3-Clause:
*
* Copyright (C) 2020 kreincke / Deutsche Telekom AG
*
* For Details see the file license in this directory
*/

package de.tdosca.common;

import java.util.Map;


public class Tipster {

  Map<String, String> env = System.getenv();
  String pwd = null;
  String inc = "......";
  String lmsg = "StartPoint unknown";

  public String speak() {

    System.out.println(inc+"de.tdosca.common.Tipster(): 'hello'.");
    System.out.println(inc+"license(Tipster,B.S.D-3-C.l.a.u.s.e)");

    if (env != null) {
      pwd=env.get("PWD");
    }
    if (pwd!=null) {
      lmsg=("StartPoint: " + pwd);
    }
    System.out.println(inc+"de.tdosca.common.Tipster(): 'bye bye'");
    return "back0";
  }
}

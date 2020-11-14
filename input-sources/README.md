# TDOSCA-TC06-PLAINHW / release <#1.0.0#>

Copyright (C) 2020 Karsten Reincke / Deutsche Telekom AG

## Content
1. [Purpose](#pur)
2. [Prerequisites](#prq)
3. [Download](#dlo)
4. [Installation](#ins)
5. [Usage](#use)
6. [Licensing](#lic)

## 1. Purpose <a id="pur"></a>
One task of the project [Test-Driven Open Source Compliance Automation](https://github.com/Open-Source-Compliance/tdosca) is to define test cases consisting of program sources and reference compliance artifacts which - added to the program package - would ensure to distribute the open source program compliantly.

The software files of the test case TDOSCA-TC06-PLAINHW are the input of the sixth tdosca test case. TC06 delivers a ***plain hello world*** program, consists of differently licensed internal classes and depends on 3 external Java libraries

## 2. Prerequisites <a id="prq"></a>
* operating system
* javare
* maven


## 3. Download <a id="dlo"></a>

You have tow options to get this test case:

* Clone the respective repository by using the command ``git clone https://github.com/Open-Source-Compliance/tdosca-tc06-plainhw``.
* Download the respective zip file by using the GitHub commands in the [tdosca-tc06-plainhw repository](https://github.com/Open-Source-Compliance/tdosca-tc06-plainhw).

## 4. Installation <a id="ins"></a>
To compile and run the program, ...
* ... download and unzip test case package or clone the test case repository
* ... change into the directory *input-sources*
* ... call ``mvn package``

## 5. Usage <a id="use"></a>
* Change into the directory *input-sources*
* Call ``mvn package`` and
  - ``java -jar target/tdosca-tc06-1.0.jar``
* or
  - ``unzip target/tdosca-tc06.zip`` and
  - ``./tdosca-tc06/bin/tc06.sh``

## 6. Licensing <a id="lic"></a>

In general, the *input* the project *tdosca-tc06-plainhw* is licensed under the terms of the MIT license (See the file LICENSE in the top directory). But other licenses are also used:

* Default License: M.I.T
* Deviantly licensed:
  - Greeter.java :- A.p.a.c.h.e-2.0 (see LICENSE.A.p.a.c.h.e-2.0)
  - GreeterTest.java :- A.p.a.c.h.e-2.0 (see LICENSE.A.p.a.c.h.e-2.0)
  - Tipster.java :- B.S.D-3-Clause
  - TipsterTest.java :- B.S.D-3-Clause

Note: In this more or less simple test case we have veiled the license identifiers by dots as not to irritate the scanning tools

# Compliance Traps of TDOSCA-TC06-PLAINHW

The test case input (= open source software)

* This app uses licenses its internal classes deviantly:
  - Default License: M.I.T
  - Deviantly licensed:
    - Greeter.java :- A.p.a.c.h.e-2.0 (see LICENSE.A.p.a.c.h.e-2.0)
    - GreeterTest.java :- A.p.a.c.h.e-2.0 (see LICENSE.A.p.a.c.h.e-2.0)
    - Tipster.java :- B.S.D-3-Clause
    - TipsterTest.java :- B.S.D-3-Clause

* The file ``common/Tipster.java`` is internally licensed by a licensing statement, but the respective license is stored in the file ``common/LICENSE``  
* On the toplevel the App delivers two license files
  - named LICENSE (MIT = Default License)
  - named LICENSE.Apache-2.0 (= valid for Greeter)
  - Hence the scanning tools must not confound these two license
* The app offers a NOTICE.md file for the class greeter
* The file LICENSE  contains the text of the MIT license but does not explicitly declare to be the MIT license

* Additionally the software depends on the external components
  * apache-log4j:
    - repository
    - license: Apache-2.0
    - NOTICE.txt: yes
  * joda-time
    - repository: https://github.com/JodaOrg/joda-time/releases
    - license: Apache-2.0
    - NOTICE.txt: yes

This 3rd Party software is integrated into the zip package created by ``mvn package``. Particularly the pom.xml does NOT declared these dependencies as *provided* etc. Hence, the scanning tools must find the respective compliance artifacts.

*Elucidation*:

* If one focuses on the upload of the repository content (sources and maven files), then one does not additionally distribute the 3rd party components. Hence, the repository on its own must only contain the compliance artifacts valid for the uploaded sources.
* But if one considers the fact, that in this case ``mvn package`` also creates a distributable zip file  containing the TC06-jar file, the 3rd-Party-jar files, and a start script (added by the maven plugin *assembly*), then it is clear, that this distributable zip file should also contain the compliance artifacts of the 3rd party components:
  - Hence the tools should also deliver the compliance artifacts of these 3rd party tools
  - For the moment, this is not implemented

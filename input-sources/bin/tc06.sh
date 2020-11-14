#!/bin/bash

JARFILE="tdosca-tc06-1.0.jar"

# get the absolute start directory of this script itself
ABS_START_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# because this script is installed in bin we know:

TDOSCA_TC_HOME="$( dirname "${ABS_START_DIR}" )"
TDOSCA_TC_CLASSES=${TDOSCA_TC_HOME}/lib

export CLASSPATH=$TDOSCA_TC_HOME:$TDOSCA_TC_CLASSES:$CLASSPATH


if [ ! -e $TDOSCA_TC_CLASSES/lib ]; then ( cd $TDOSCA_TC_CLASSES && ln -s ../lib . ); fi

java -jar $TDOSCA_TC_CLASSES/$JARFILE
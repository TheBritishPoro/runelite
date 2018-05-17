#!/bin/bash

PROJECT_VERSION=`mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive exec:exec`

if [[ $PROJECT_VERSION == *"-SNAPSHOT" && "$CI_COMMIT_REF_NAME" == "internal" ]]; then
	mvn clean deploy --settings travis/settings.xml
else
	mvn clean install --settings travis/settings.xml
fi

#!/bin/bash

# This script will create the required folder structure, compile the java code, move the compiled classes
# to their respective locations and place the sample config file.

# Some configurations
TARGET=client
SOURCE=src
OUTPUT=output

clear

echo -e 'Your Java version is:\n'
java -version
echo -e "\nIf you don't have Java installed, or your version is < openJDK 18.0, please press 'ctrl + c' to install Java or update before continuing.\n"
read -p 'Press enter to continue or ctrl + c to abort and install or update Java'

echo 'Setting up...'
mkdir -p $TARGET/gov/loc $TARGET/sample $TARGET/output
javac $SOURCE/gov/loc/*.java $SOURCE/sample/*.java
mv $SOURCE/gov/loc/*.class $TARGET/gov/loc && mv $SOURCE/sample/*.class $TARGET/sample
cp loc.cfg $TARGET

echo -e '\nDone!\n'
echo -e "To run the sample code:\n
 edit the $TARGET/loc.cfg file and add your API KEY obtained from https://api.data.gov/\n
 then execute: cd $TARGET && java sample.Main bill\n
 By default, the stored result can be found in the .txt file in the $TARGET/$OUTPUT folder"
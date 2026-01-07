#!/bin/bash

JAR_FILE="PetWolf" # Dont add .jar

function remove() {
	rm -rf $1 > /dev/null 2> /dev/null
}

function cecho() {
	echo -e "\e[$1m${@:2}\e[0m"
}

cecho 93 "Build started!"

cecho 93 "Cleaning"

remove "$JAR_FILE.jar"
mkdir "bin" > /dev/null 2> /dev/null

cd src

# Get files

cecho 93 "Getting file list"

find -name "*.java" > "files.txt"

cecho 93 "Running javac"

# Run compiler

javac @files.txt -cp "../lib/*" -d "../bin"

# Check exit code

if [[ $JAVAC_EXIT -ne 0 ]]; then
	cecho 91 "BUILD FAILED!"
	exit -1
else
	cecho 92 "BUILD SUCCESS!"
fi

# Remove excess files

cecho 93 "Cleaning"

remove "files.txt"

cd ../

# Make jar
cecho 93 "Copying plugin.yml to destination"
cp src/plugin.yml bin/

cecho 93 "Making jar file"

(jar cvf "../plugin.yml" ./*) | xargs -L1 -I _ printf "\e[96m.\e[0m"

cd bin

(jar cvf "../$JAR_FILE.jar" ./*) | xargs -L1 -I _ printf "\e[96m.\e[0m"

printf "\n" # Newline

cd ../

cecho 93 "Cleaning"

remove "bin" # remove bin


cecho 92 "DONE!"
#!/bin/sh 

programdir="." 

APP_HOME=${PWD}/..
JVM_ARGS="-DlogDir=$APP_HOME/logs"
if [ -r app.vmoptions ];then
JVM_ARGS="$JVM_ARGS `tr '\n' ' ' < app.vmoptions`"
fi

num=$# 
temp=$CLASSPATH 
#setting libs path 
libs=../lib/* 
append(){ 
                temp=$temp":"$1 
} 
for file in $libs;    do 
                append $file 
done 
export CLASSPATH=$temp:.:../:$programdir 

nohup java -classpath $CLASSPATH  org.eh.core.http.EHServer & >>ehserver.log 2>>1&
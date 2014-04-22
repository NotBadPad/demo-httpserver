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
export LANG=zh_CN 
printf 'EHServer is starting...\n'
nohup java $JVM_ARGS -classpath $CLASSPATH  org.eh.core.http.EHServer >../nohup.out &
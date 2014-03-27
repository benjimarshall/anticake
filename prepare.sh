#!/bin/sh
ant build
for i in `seq 2 1000`
do
   echo "Congratulations! You have collected $i cake so far!" > "Cake $i.txt"
done

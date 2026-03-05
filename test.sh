#!/bin/bash
read -p"Enter three Numbers " a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
	echo $a "is great"
elif [ $b -gt $c ] && [ $b -gt $a ]
then
	echo $b "is great"
else
	echo $c "is great"

fi		

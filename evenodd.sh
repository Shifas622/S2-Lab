#!/bin/bash
read -p"Enter a Number: " n
if [ $(( $n % 2 )) -eq 0 ]
then echo "Even Number"
else
    echo "odd Number"
fi
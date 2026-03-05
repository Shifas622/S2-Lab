#!/bin/bash

echo "Enter directory name:"
read dir

count=$(ls -l "$dir" | grep "^-" | wc -l)

echo "Number of files: $count"
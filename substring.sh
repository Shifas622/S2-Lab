#!/bin/bash

echo "Enter a string:"
read str

echo "Enter starting position:"
read pos

echo "Enter length:"
read len

sub=${str:$pos:$len}

echo "Substring: $sub"
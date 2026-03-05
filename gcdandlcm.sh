#!/bin/bash

echo "Enter first number:"
read a
echo "Enter second number:"
read b

# Store original numbers for LCM
x=$a
y=$b

# Calculate GCD using Euclidean algorithm
while [ $b -ne 0 ]
do
    temp=$b
    b=$((a % b))
    a=$temp
done

gcd=$a
lcm=$(( (x * y) / gcd ))

echo "GCD: $gcd"
echo "LCM: $lcm"
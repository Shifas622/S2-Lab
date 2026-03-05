#!/bin/bash

while true
do
    read -p "Enter 2 numbers: " a b
    read -p "Enter the operator (+ - * /): " op

    case $op in
        "+")
            ans=$((a + b))
            ;;
        "-")
            ans=$((a - b))
            ;;
        "*")
            ans=$((a * b))
            ;;
        "/")
            if [ "$b" -eq 0 ]; then
                echo "Error: Division by zero"
                continue
            fi
            ans=$((a / b))   # integer division
            ;;
        *)
            echo "Bad Move"
            continue
            ;;
    esac

    echo "$a $op $b = $ans"
done

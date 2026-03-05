#!/bin/bash

echo "===== System Configuration ====="

echo "Hostname: $(hostname)"
echo "Operating System: $(uname -o)"
echo "Kernel Version: $(uname -r)"
echo "Architecture: $(uname -m)"
echo "CPU Info: $(lscpu | grep 'Model name' | awk -F: '{print $2}')"
echo "Total Memory: $(free -h | grep Mem | awk '{print $2}')"
echo "Available Memory: $(free -h | grep Mem | awk '{print $7}')"
echo "Disk Usage: $(df -h / | awk 'NR==2{print $3 " used / " $2 " total"}')"
echo "Logged in Users: $(who | wc -l)"
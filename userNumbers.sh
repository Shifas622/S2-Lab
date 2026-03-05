if [ $# -eq 1 ]
then
who  > user.1st
echo "$1 User is logged at"
grep -c $s1 user.1st
else
echo "pls enter username"
fi
#!/bin/sh
# Copyright 2017-2019 lxb.
# License Apache License, Version 2.0
# @author lxb
for ((i=1; i<=$1; i++));
  do
  mod5=$(($i%5))
  mod3=$(($i%3))
  if [ $mod5 == 0 ] && [ $mod3 == 0 ];then
    echo "FizzBuzz";
  elif [ $mod3 == 0 ];then
    echo "Fizz";
  elif [ $mod5 == 0 ];then
    echo "Buzz";
  else
   echo $i;
  fi
done
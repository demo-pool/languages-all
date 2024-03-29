#!/usr/bin/env bash
#
# Copyright 2017-2023 lxb.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
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
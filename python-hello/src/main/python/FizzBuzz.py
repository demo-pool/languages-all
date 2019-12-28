# -*- coding=utf-8 -*-
import sys

n = int(sys.argv[1])
print(n)

for i in range(1, n + 1):
  整除5 = i % 5 == 0
  整除3 = i % 3 == 0
  if 整除3 and 整除5:
      print('FizzBuzz')
  elif 整除3:
      print("Fizz")
  elif 整除5:
      print("Buzz")
  else:
      print(i)

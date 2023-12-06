/*
 * Copyright 2017-2023 lxb.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.devit.demo;

public class FizzBuzz {

  public static void main(String[] args) {
    if (args.length > 0) {
      int n = Integer.parseInt(args[0]);
      new FizzBuzz().fizzBuzz(n);
    } else {
      System.out.println("在参数中给出大于1的整数");
    }
  }

  void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
      boolean 倍3 = i % 3 == 0;
      boolean 倍5 = i % 5 == 0;
      if (倍3 && 倍5) {
        System.out.println("FizBuzz");
      } else if (倍3) {
        System.out.println("Fizz");
      } else if (倍5) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}

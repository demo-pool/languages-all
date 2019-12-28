/*
 * Copyright 2017-2019 lxb.
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
object FizzBuzz extends App {
  var n = args(0).toInt;
  for (a <- 1 to n) {
    if (a % 3 == 0 && a % 5 == 0) {
      println("FizzBuzz")
    } else if (a % 3 == 0) {
      println("Fizz")
    } else if (a % 5 == 0) {
      println("Buzz")
    } else {
      println(a)
    }
  }
}
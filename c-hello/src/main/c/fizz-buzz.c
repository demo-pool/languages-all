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
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
  if (argc == 2) {
    int n = atoi(argv[1]);
    for (int i = 1; i <= n; ++i) {
      if (i % 3 == 0 && i % 5 == 0) {
        puts("FizzBuzz");
      } else if (i % 3 == 0) {
        puts("Fizz");
      } else if (i % 5 == 0) {
        puts("Buzz");
      } else {
        printf("%d\n", i);
      }
    }

    return EXIT_SUCCESS;
  } else {
    puts("Need int arg.");
    return EXIT_FAILURE;

  }
}

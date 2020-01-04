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

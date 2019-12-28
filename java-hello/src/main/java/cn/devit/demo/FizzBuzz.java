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

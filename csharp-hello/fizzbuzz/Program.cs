﻿using System;

namespace fizzbuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Int32.Parse(args[0]);
            for (int i = 1; i <= n; i++)
            {
                if (i % 3 == 0 && i % 5 == 0){
                    Console.WriteLine("FizzBuzz");
                }else if (i % 3 == 0){
                    Console.WriteLine("Fizz");
                }else if (i % 5 == 0){
                    Console.WriteLine("Buzz");
                }else{
                    Console.WriteLine(i);
                }
            }
        }
    }
}

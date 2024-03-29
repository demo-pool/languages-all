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
 use std::env;
fn main() {
  let args: Vec<_> = env::args().collect();
  if args.len() > 1 {
    let n:u32 = args[1].parse().expect("Not a number!");
    for i in 1..n {
      if i % 3 ==0 && i % 5 ==0 {
        println!("FizzBuzz");
      }else if i%3==0 {
        println!("Fizz"); 
      }else if i%5 ==0{
        println!("Buzz");
      }else {
        println!("{}",i);
      }       
    }
  }
}

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

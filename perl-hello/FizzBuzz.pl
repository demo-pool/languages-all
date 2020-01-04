#!/usr/bin/perl
$n = @ARGV[0];
for( $i = 1; $i <= 100; $i = $i + 1){
  if($i % 3 ==0 && $i % 5==0){
    print "FizzBuzz\n";
  }elsif($i%3==0){
    print "Fizz\n";
  }elsif($i % 5 ==0){
    print "Buzz\n";
  }else{
    print "$i\n";
  }
}
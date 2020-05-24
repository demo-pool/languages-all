// Learn more about F# at http://fsharp.org

open System

[<EntryPoint>]
let main argv =
    let n = Int32.Parse( argv.[0] )
    for i = 1 to n do
      if i % 3 = 0 && i % 5 = 0 then
        printfn "FizzBuzz"
      elif i % 3 = 0 then
        printfn "Fizz"
      elif i % 5 = 0 then
        printfn "Buzz"    
      else  
        printfn "%s" (string i);
    0 // return an integer exit code

package main
import  "fmt"
import "os"
import "strconv"
func main() {
    n ,err := strconv.Atoi(os.Args[1])
    if err == nil{
        for i:=1;i<=n;i++{
            if i % 3 ==0 && i % 5 == 0{
                fmt.Println("FizzBuzz") 
            }else if i % 3 == 0 {
                fmt.Println("Fizz")
            }else if i % 5 == 0 {
                fmt.Println("Buzz")    
            }else{
                fmt.Println(i)
            }
        }
    }
}
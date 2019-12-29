Imports System

Module Program
    Sub Main(args As String())
        Dim n as Integer = Cint(args(0))
        For i As Integer = 1 To n
            if i mod 5 = 0 and i mod 3 = 0 then
              Console.WriteLine("FizzBuzz")
            elseif i mod 3 =0 then
              Console.WriteLine("Fizz")
            elseif i mod 5 = 0 then
              Console.WriteLine("Buzz")  
            else
              Console.WriteLine(i)
            end if
        Next i
    End Sub
End Module

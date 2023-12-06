'''
''' Copyright 2017-2023 lxb.
'''
''' Licensed under the Apache License, Version 2.0 (the "License");
''' you may not use this file except in compliance with the License.
''' You may obtain a copy of the License at
'''
'''      http://www.apache.org/licenses/LICENSE-2.0
'''
''' Unless required by applicable law or agreed to in writing, software
''' distributed under the License is distributed on an "AS IS" BASIS,
''' WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
''' See the License for the specific language governing permissions and
''' limitations under the License.
'''

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

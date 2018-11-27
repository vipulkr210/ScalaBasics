package com.vipul.basics


object TailRecursion {
  
  def factorial(n: Int) : Int = {         
    if( n == 1) 1
    else n * factorial(n-1)
      
  }
 /* def factorial(fact: Int, n: Int) : Int = {
    if( n == 1) fact
    else  factorial(fact * n, n-1)
      
  }*/
  @scala.annotation.tailrec
   def factorial(fact: BigInt, n: BigInt) : BigInt = {
    if( n == BigInt(1)) fact
    else   
     factorial(fact * n, n-1)
      
  }
  
  
  def main(args: Array[String]) : Unit = {
   // println(factorial(5000))                 // try for 5000    Output 0 ->  oops........ :(
    println(factorial(BigInt(1), BigInt(500)))
  }
}
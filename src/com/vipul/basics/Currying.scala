package com.vipul.basics

object Currying {
  // Shorthand
  def add(x: Int)(y: Int) : Int ={
    x+y
  }
  
  
  // longhand
 def add1(x: Int): (Int => Int)  = {
    (y: Int) => {
    x+y
    }
  }
  
  def main(args: Array[String]) = {
    def sum(i :Int) : Int = i+1
  //  def addOne(i: Int): Int = i += 1; i
    def addTwo(i: Int): Int = { 
      var c =i
      c += 1; c
    }
    println("Shorthand: 3+1  "+(add(3)_).apply(1))
    
    println("longhand: 3+4  "+add1(3).apply(4))
  }
}


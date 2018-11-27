package com.vipul.basics

class Car(val year: Int, var miles: Int)
case class Person (val first: String, val second: String)
object Car {
  
  var car = new Car(2018,0)

  // Tuples
  
  def createPerson() = {
    ("Vipul", "Kumar")
  }
  
 /* def createPersonOne :Seq[Person] = {
    val p = Person("Vipul","Chaudhary")
    val p1 = Person("Akash","Chaudhary")
    val p2 = Person("Rajat","Chaudhary")
    val abc = Seq(p) :+ p1 :+ p2
    abc
  }*/
  
  def main(args: Array[String]) = {
    
    println(s"Year: ${car.year},  Miles : ${car.miles}")
    
    var showPerson = createPerson()
    println(showPerson._1 , showPerson._2)
    
   // var showPersonOne = createPersonOne
    //println(showPersonOne.filter(p=> p.first == "Vipul" || p.first == "Akash"))
    //println(showPersonOne)
    //println("Using Map:  "+showPersonOne.map(p => p.first))
    //println("Using flatMap:  "+showPersonOne.flatMap(p => p.first.toUpperCase()))
    
  }
  
}
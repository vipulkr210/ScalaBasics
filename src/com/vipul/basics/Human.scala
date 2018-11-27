package com.vipul.basics
//Traits Example
// friend is a good listener  (dog)
// friendable interface we can implement....... human - dog... interface can not have methods
// create friendable abstract class ,, cannot inherit multiple class
// scala will do this for you ------ trait is interface  plus abstract base class
trait Friend {
  val name: String
  def listen = println("I am  "+name+" listening.")
}
class Human(val name: String) extends Friend 

class Animal(val name: String)
class Dog(override val name: String) extends Animal(name) with Friend
class Cat(override val name: String) extends Animal(name)

object Human {
  def main(args: Array[String]) = {
    var vipul = new Human("Vipul")
    vipul.listen
    val buddy = new Dog("Buddy")
    buddy.listen
   // val cat = new Cat("Alf") 
  //  cat.listen
    val clinton = new Cat("Clinton") with Friend              // Special Functionality
    clinton.listen
  }
}
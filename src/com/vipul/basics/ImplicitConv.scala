package com.vipul.basics

import java.util.Calendar

class ImplicitConv(val number: Int) {
   def days = this
   def ago =  {
     var today = Calendar.getInstance
     today.add(Calendar.DAY_OF_MONTH, -number)
     today.getTime
   }
}
object ImplicitConv {
  implicit def fromInt(num:Int) = new ImplicitConv(num)
  def main(args:Array[String]) {
    println(2.days.ago) 
  }

}



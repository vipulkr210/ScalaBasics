package com.vipul.basics
//Decorators using traits
abstract class Writers {
  def write(msg: String)
}

class StringWriter extends Writers {
  val target = new StringBuilder
  
  override def write(msg: String) = {
    target.append(msg)
  }
  
  override def toString = target.toString()
}
trait UpperClassFilter extends Writers {                   // Filter to make text to uppercase
  abstract override def write(msg: String) = {
    super.write(msg.toUpperCase())
  }
}
trait ProfanityFilter extends Writers {                    // Filter to replace offensive words 
  abstract override def write(msg: String) = {
    super.write(msg.replace("stupid", "s*****d"))
  }
}

object Writers {
   def writeStuff(writer: Writers)  = {
     writer.write("This is stupid")
     println(writer)
}
   def main(args: Array[String]) = {
     writeStuff(new StringWriter )
     writeStuff(new StringWriter with UpperClassFilter )
     writeStuff(new StringWriter with ProfanityFilter )
     writeStuff(new StringWriter with UpperClassFilter with ProfanityFilter)
     writeStuff(new StringWriter with ProfanityFilter with UpperClassFilter)
   }
}
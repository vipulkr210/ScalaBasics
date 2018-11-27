package com.vipul.basics

class DecoratorTraits

abstract class Check {
  def check():String ="Checked application details"
}

trait employmentCheck extends Check {
  override def check():String="Checked employment details " +super.check()
}

trait creditCheck extends Check {
  override def check():String="Checked credit details " +super.check()
}

trait crimeCheck extends Check {
  override def check():String="Checked crime details " +super.check()
}

object DecoratorTraits
{
   def main(args:Array[String])
  {
    println("======================================================")
    println(notes())
    println("======================================================")
    println("Logic execution strace below")
    println("======================================================")
    val newEmpCheck = new Check with employmentCheck with crimeCheck
    val newTenantCheck = new Check with employmentCheck with crimeCheck with creditCheck
    println(newEmpCheck check)
    println(newTenantCheck check)
  }

  def notes() =
    {
      """
      Wikipedia says "The decorator pattern can be used to make it possible to extend (decorate) the functionality of a
      certain object at runtime, independently of other instances of the same class, provided some groundwork is done at design time."
      In example above multiple checks are added e.g. employment,credit,crime.
      newEmpCheck though uses decorator pattern you can see at design time we need to add super.check() in each trait to achieve
      expected result.
     Points to Note:
      1. Also each trait extends abstract class so these traits can ONLY be mixed with the class which extends same abstract class.
      2. Also if abstract class Check has some concrete utility methods those can be utilized in trait's concrete check implementation.
      3. straight from pragprog book to understand execution( late method bnding for this particular example )
      "The rightmost trait picked up the call to check(). It then, upon the call to super.check(), passed the call over to the trait
      on its left. The leftmost traits invoked the check() on the actual instance."
      """
    }
}
package com.vipul.decorators

class CheeseTopping(override val topping : Topping) extends ToppingDecorator(topping) {
    override def getPrice() : Double = {
        super.getPrice() + 59.0
    }
    override def getName() : String = {
        val previous = super.getName()
        "Ocean Cheese " + previous
    }
}
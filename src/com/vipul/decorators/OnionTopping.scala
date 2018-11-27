package com.vipul.decorators

class OnionTopping(override val topping : Topping) extends ToppingDecorator(topping) {
    override def getPrice() : Double = {
        super.getPrice() + 39.0
    }
    override def getName() : String = {
        val previous = super.getName()
        "Sprinkled Onion " + previous
    }
}
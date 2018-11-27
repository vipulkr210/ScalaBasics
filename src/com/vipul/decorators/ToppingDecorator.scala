package com.vipul.decorators

class ToppingDecorator(val topping : Topping) extends Topping {
    var nextTopping : Topping = topping
    def getName() : String = nextTopping.getName()
    def getPrice() : Double = nextTopping.getPrice()
    def addTopping() : Topping = this
}
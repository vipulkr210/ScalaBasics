package com.vipul.decorators

class BasePizza extends Topping {
    def getName() : String = "Pizza"
    def getPrice() : Double = 77.0
    def addTopping() : Topping = this
}
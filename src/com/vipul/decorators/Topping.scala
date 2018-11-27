package com.vipul.decorators

trait Topping {
    def getName() : String
    def getPrice() : Double
    def addTopping() : Topping
}
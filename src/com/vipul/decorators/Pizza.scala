package com.vipul.decorators

class Pizza {
    var topping : Topping = new BasePizza
    def getPrice() : Double = {
        topping.getPrice()
    }
    def getName() : String = {
        topping.getName()
    }
    def addNewTopping(toppingName : String) : Boolean = {
        toppingName match
        {
            case "Onion" =>
            {
                this.topping = new OnionTopping(topping)
                true
            }
            case "Cheese" =>
            {
                this.topping = new CheeseTopping(topping)
                true
            }
            case _ =>
                println("Topping unavailable! Better luck next time! :(")
                false
        }
    }
}
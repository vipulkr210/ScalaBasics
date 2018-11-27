package com.vipul.decorators

object PizzaStore extends App {
    val pizza = new Pizza
    pizza.addNewTopping("Cheese")
    pizza.addNewTopping("Onion")
    println(s"You have ordered ${pizza.getName}")
    println(s"You have to pay Rupees ${pizza.getPrice}")
}
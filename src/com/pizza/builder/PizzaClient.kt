package com.pizza.builder

fun main(args: Array<String>) {
    val productOne = PizzaBuilder()
        .withSize(Size.Medium)
        .withCheese(Cheese.American)
        .withCrust(Crust.Stuffed)
        .withTopping(Topping.Chicken).build()

    val productTwo = PizzaBuilder()
        .withSize(Size.Small)
        .withCheese(Cheese.American).build()

    println(productOne.getPizzaInfo() +" cost : "+productOne.getTotalCost())

    println(productTwo.getPizzaInfo() +" cost : "+productTwo.getTotalCost())
}
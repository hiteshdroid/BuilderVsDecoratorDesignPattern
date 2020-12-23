package com.pizza.decorator

fun main(args: Array<String>) {
    val finalPizza = StuffedCrustDecorator(
        ChickenToppingDecorator(
            AmericanCheeseDecorator(
                SmallSizePizzaDecorator(
                    BasePizza()
                )
            )
        )
    )

    println(finalPizza.getName())
    println(finalPizza.getCost())
}
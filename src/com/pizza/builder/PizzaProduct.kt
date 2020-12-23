package com.pizza.builder

class PizzaProduct(private val pizzaBuilder: PizzaBuilder) {
    fun getTotalCost() : Double {
        return pizzaBuilder.contents.sumByDouble {
            it.getCost().toDouble()
        }
    }

    fun getPizzaInfo() : String {
        return pizzaBuilder.contents.joinToString {
            it.getName()
        }
    }
}
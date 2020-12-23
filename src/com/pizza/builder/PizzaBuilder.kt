package com.pizza.builder

class PizzaBuilder {
    var contents: MutableList<PizzaAttribute> = mutableListOf()

    fun withSize(size: Size): PizzaBuilder {
        addPizzaAttribute(size)
        return this
    }

    fun withTopping(topping: Topping): PizzaBuilder {
        addPizzaAttribute(topping)
        return this
    }

    fun withCrust(crust: Crust): PizzaBuilder {
        addPizzaAttribute(crust)
        return this
    }

    fun withCheese(cheese: Cheese): PizzaBuilder {
        addPizzaAttribute(cheese)
        return this
    }

    private fun addPizzaAttribute(size: PizzaAttribute) {
        contents.add(size)
    }

    fun build() = PizzaProduct(this)
}
package com.pizza.decorator

open class BasePizzaDecorator(private val pizza: AbstractPizza) : AbstractPizza {
    override fun getName() = pizza.getName()

    override fun getCost() = pizza.getCost()
}

class SmallSizePizzaDecorator(private val pizza: AbstractPizza): BasePizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName() + " Small "
    }

    override fun getCost(): Double {
        return pizza.getCost() + 100.00
    }
}

class ChickenToppingDecorator(private val pizza: AbstractPizza): BasePizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName() + " With Chicken Toppings "
    }

    override fun getCost(): Double {
        return pizza.getCost() + 20.00
    }
}

class AmericanCheeseDecorator(private val pizza: AbstractPizza): BasePizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName() + " With American Cheese "
    }

    override fun getCost(): Double {
        return pizza.getCost() + 20.00
    }
}

class StuffedCrustDecorator(private val pizza: AbstractPizza): BasePizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName() + " With Stuffed Crust "
    }

    override fun getCost(): Double {
        return pizza.getCost() + 200.00
    }
}
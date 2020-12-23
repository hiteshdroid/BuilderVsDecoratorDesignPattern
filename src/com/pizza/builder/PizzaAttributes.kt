package com.pizza.builder

abstract class PizzaAttribute {
    abstract fun getName(): String
    abstract fun getCost(): Float
}


sealed class Size: PizzaAttribute() {
    object Small : Size() {
        override fun getName() = "Small Size Pizza"
        override fun getCost() = 100.00F
    }

    object Medium : Size() {
        override fun getName() = "Medium Size Pizza"
        override fun getCost() = 200.00F
    }

    object Large : Size() {
        override fun getName() = "Large Size Pizza"
        override fun getCost() = 300.00F
    }
}

sealed class Topping: PizzaAttribute() {
    object Pepperoni : Topping() {
        override fun getName() = "Pepperoni Topping"
        override fun getCost() = 10.00F
    }

    object Mushroom : Topping() {
        override fun getName() = "Mushroom Topping"
        override fun getCost() = 30.00F
    }

    object Chicken : Topping() {
        override fun getName() = "Chicken Topping"
        override fun getCost() = 20.00F
    }
}

sealed class Crust: PizzaAttribute() {
    object Thin : Crust() {
        override fun getName() = "Thin Crust"
        override fun getCost() = 30.00F
    }

    object Stuffed : Crust() {
        override fun getName() = "Stuffed Crust"
        override fun getCost() = 50.00F
    }

    object Thick : Crust() {
        override fun getName() = "Thick Crust"
        override fun getCost() = 40.00F
    }
}

sealed class Cheese: PizzaAttribute() {
    object American : Cheese() {
        override fun getName() = "American Cheese"
        override fun getCost() = 35.00F
    }

    object Italian : Cheese() {
        override fun getName() = "Italian Cheese"
        override fun getCost() = 55.00F
    }
}






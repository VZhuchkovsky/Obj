package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class PizzaStore {
    PizzaCreator pizzaCreator;

    public PizzaStore(PizzaCreator pizzaCreator) {
        this.pizzaCreator = pizzaCreator;
    }

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = pizzaCreator.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();

        return pizza;
    }
}

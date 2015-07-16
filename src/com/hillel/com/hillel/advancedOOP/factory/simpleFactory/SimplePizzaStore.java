package com.hillel.com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.PizzaType;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class SimplePizzaStore {
    SimplePizzaCreator pizzaCreator = new SimplePizzaCreator();
    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = pizzaCreator.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();

        return pizza;
    }

}
package com.hillel.com.hillel.advancedOOP.factory.ny;

import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.PizzaCreator;
import com.hillel.com.hillel.advancedOOP.factory.PizzaType;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class NyPizzaCreator implements PizzaCreator {
    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case SEAFOOD:
                pizza = new NySeafoodPizza();
                break;
            case CHEESE:
                pizza = new NyCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }
}
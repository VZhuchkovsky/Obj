package com.hillel.com.hillel.advancedOOP.factory.chicago;

import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.PizzaCreator;
import com.hillel.com.hillel.advancedOOP.factory.PizzaType;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class ChicagoPizzaCreator implements PizzaCreator {
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case SEAFOOD:
                pizza = new ChicagoSeafoodPizza();
                break;
            case CHEESE:
                pizza = new ChicagoCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }
}

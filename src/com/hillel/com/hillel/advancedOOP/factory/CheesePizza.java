package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class CheesePizza extends Pizza {
    public CheesePizza(IngredientCreator ingredientCreator) {
        setDough(ingredientCreator.createDough());
        setCheese(ingredientCreator.createCheese());
    }
}
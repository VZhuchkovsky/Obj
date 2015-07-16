package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class SeafoodPizza extends Pizza {
    public SeafoodPizza(IngredientCreator ingredientCreator) {
        setDough(ingredientCreator.createDough());
        setSeafood(ingredientCreator.createSeafood());
    }
}

package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public interface IngredientCreator {
    Dough createDough();
    Seafood createSeafood();
    Cheese createCheese();
}
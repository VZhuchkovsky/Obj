package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class NyIngredientCreator implements IngredientCreator{
    @Override
    public Dough createDough() {
        return new Dough("Thin");
    }

    @Override
    public Seafood createSeafood() {
        return new Seafood("Oyster");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Parmegano");
    }
}
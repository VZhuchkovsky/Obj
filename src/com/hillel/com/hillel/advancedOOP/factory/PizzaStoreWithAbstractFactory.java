package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class PizzaStoreWithAbstractFactory {
    IngredientCreator ingredientCreator;

    public PizzaStoreWithAbstractFactory(IngredientCreator ingredientCreator) {
        this.ingredientCreator = ingredientCreator;
    }

    public Pizza orderPizza(PizzaType pizzaType){
        switch (pizzaType){
            case CHEESE:
                return new CheesePizza(ingredientCreator);
            case SEAFOOD:
                return new SeafoodPizza(ingredientCreator);
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
    }
}
package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 15;
    }

    @Override
    public String description() {
        return beverage.description() + ", cream";
    }
}

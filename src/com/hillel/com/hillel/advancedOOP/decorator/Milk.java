package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String description() {
        return beverage.description() + ", milk";
    }
}

package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public abstract class BeverageDecorator extends Beverage{
    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {

    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}

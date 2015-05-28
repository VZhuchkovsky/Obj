package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public int cost() {
        return 95 ;
    }

    @Override
    public String description() {
        return "HouseBlend";
    }
}

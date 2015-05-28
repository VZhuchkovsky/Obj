package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class Arabica extends Beverage {
    @Override
    public int cost() {
        return 100 ;
    }

    @Override
    public String description() {
        return "Arabica";
    }
}

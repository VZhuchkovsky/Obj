package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class Robusta extends Beverage {

    @Override
    public int cost() {
        return 90 + super.cost();
    }

    @Override
    public String description() {
        return "Robusta";
    }
}

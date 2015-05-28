package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public abstract class Beverage {
    boolean hasMilk;
    boolean hasCream;

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public void setHasCream(boolean hasCream) {
        this.hasCream = hasCream;
    }

    public int cost(){
        int cost = 0;
        if (hasMilk) {
            cost += 10;
        }
        if (hasCream) {
            cost += 15;
        }
        return cost;
    }


    public abstract String description();
}

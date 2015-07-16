package com.hillel.com.hillel.advancedOOP.factory.chicago;

import com.hillel.com.hillel.advancedOOP.factory.Cheese;
import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class ChicagoCheesePizza  extends Pizza {
    public ChicagoCheesePizza() {
        setDough(new Dough("Thick"));
        setCheese(new Cheese("Mozarella"));
    }
}
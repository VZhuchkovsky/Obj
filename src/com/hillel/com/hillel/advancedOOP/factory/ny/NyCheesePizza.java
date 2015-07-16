package com.hillel.com.hillel.advancedOOP.factory.ny;

import com.hillel.com.hillel.advancedOOP.factory.Cheese;
import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class NyCheesePizza extends Pizza {
    public NyCheesePizza() {
        setDough(new Dough("thin"));
        setCheese(new Cheese("Parmegano"));
    }
}

package com.hillel.com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.com.hillel.advancedOOP.factory.Cheese;
import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        setCheese(new Cheese("Rockfor"));
        setDough(new Dough("Thick"));
    }
}

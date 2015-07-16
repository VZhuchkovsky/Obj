package com.hillel.com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class SeafoodPizza extends Pizza {
    public SeafoodPizza() {
        setDough(new Dough("Thick"));
        setSeafood(new Seafood("Fish"));
    }
}
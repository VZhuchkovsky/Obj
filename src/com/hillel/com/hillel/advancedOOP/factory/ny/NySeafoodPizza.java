package com.hillel.com.hillel.advancedOOP.factory.ny;

import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class NySeafoodPizza extends Pizza {
    public NySeafoodPizza() {
        setDough(new Dough("thin"));
        setSeafood(new Seafood("Oysters"));
    }
}
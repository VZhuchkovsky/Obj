package com.hillel.com.hillel.advancedOOP.factory.chicago;

import com.hillel.com.hillel.advancedOOP.factory.Dough;
import com.hillel.com.hillel.advancedOOP.factory.Pizza;
import com.hillel.com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class ChicagoSeafoodPizza extends Pizza {
    public ChicagoSeafoodPizza() {
        setDough(new Dough("Thick"));
        setSeafood(new Seafood("Fish"));
    }
}
package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class Seafood {
    String name;

    public Seafood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seafood{" +
                "name='" + name + '\'' +
                '}';
    }
}
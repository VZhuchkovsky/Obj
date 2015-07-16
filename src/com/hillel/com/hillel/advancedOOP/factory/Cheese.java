package com.hillel.com.hillel.advancedOOP.factory;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class Cheese {
    String name;

    public Cheese(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }
}
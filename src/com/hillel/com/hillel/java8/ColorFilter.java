package com.hillel.com.hillel.java8;

import java.util.function.Predicate;

/**
 * Created by MFarsikov on 20.07.2015.
 */
public class ColorFilter implements Predicate<Apple>{
    @Override
    public boolean test(Apple apple) {
        return "Green".equals(apple.getColor());
    }
}
package com.hillel.com.hillel.advancedOOP.decorator;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage coffee = new Arabica();

        System.out.println(coffee.description());

        coffee = new Milk(coffee);

        System.out.println(coffee.description());

        coffee = new Cream(coffee);

        System.out.println(coffee.description());
    }
}

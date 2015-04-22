package com.hillel.com.hillel.Inheritance;

/**
 * Created by VZhuchkovsky on 22.04.2015.
 */
public class Rectangle extends Shape {


    private int a;
    private int b;

    public Rectangle(int b, int a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle, " + a + "x" + b + " " + super.toString();
    }

    @Override
    public String getColor() {
        return "White";
    }
}

package com.hillel.com.hillel.HomeTask.RectangleOOP;

/**
 * Created by VZhuchkovsky on 25.06.2015.
 */
public class RectangleOOP {
    public double length;
    public double width;

    RectangleOOP(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public String toString() {
        return "RectangleOOP{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

//RectangleOOP rectangle1 = new RectangleOOP(4,1);
    //RectangleOOP rectangle2 = new RectangleOOP(8,4);
    //RectangleOOP rectangle3 = new RectangleOOP(20,25);

}
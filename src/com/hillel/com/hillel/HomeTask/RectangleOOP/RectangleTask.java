package com.hillel.com.hillel.HomeTask.RectangleOOP;

/**
 * Created by VZhuchkovsky on 25.06.2015.
 */
public class RectangleTask {
   private double perimetr;
   private double square;

    public RectangleTask(double p, double s) {
        this.perimetr = p;
        this.square = s;
    }

    public boolean hasSolution() {
        if (Math.pow(perimetr / 2, 2) - 4 * square < 0)
            return false;
        else return true;
    }

    public RectangleOOP resolve() {
        double l;
        double w;
        double d = Math.pow(perimetr / 2, 2) - 4 * square;
        if (d > 0) {
            l = ((perimetr / 2) + Math.sqrt(d)) / 2;
            w = ((perimetr / 2) - Math.sqrt(d)) / 2;
            return new RectangleOOP(l, w);
            //System.out.println("width = " + x + "\nheight = " + y);
        } else if (d == 0) {
            l = (perimetr / 2) / 2;
            w = l;
            return new RectangleOOP(l, w);
            // System.out.println("length = " + y);
            // System.out.println("width = " + x);
        } else {
            //System.out.println("Equation has no solution!");
            return null;
        }

    }

    public static void main(String[] args) {
        RectangleTask task = new RectangleTask(4, 4);
        if (task.hasSolution()){
            task.resolve();
        }
        else{

        }

    }
}
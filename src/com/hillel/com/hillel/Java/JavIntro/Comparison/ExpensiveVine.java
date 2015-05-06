package com.hillel.com.hillel.Java.JavIntro.Comparison;

/**
 * Created by VZhuchkovsky on 06.05.2015.
 */
public class ExpensiveVine extends Vine {
    public ExpensiveVine(int year, int price){
        super(year,price);
    }

    @Override
    public String taste() {
        return "Magnificent";
    }
}

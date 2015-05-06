package com.hillel.com.hillel.Java.JavIntro.Comparison;

/**
 * Created by VZhuchkovsky on 06.05.2015.
 */
public class CheapVine extends Vine {
    public CheapVine(int year, int price){
        super(year,price);
    }

    @Override
    public String taste() {
        return "Sour";
    }
}

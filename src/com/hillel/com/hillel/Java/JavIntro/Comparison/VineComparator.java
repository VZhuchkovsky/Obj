package com.hillel.com.hillel.Java.JavIntro.Comparison;

import java.util.Comparator;

/**
 * Created by VZhuchkovsky on 29.04.2015.
 */
public class VineComparator implements Comparator<Vine> {
    @Override
    public int compare(Vine one,Vine other){
        return one.getPrice() - other.getPrice();
    }
}

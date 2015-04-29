package com.hillel.com.hillel.Java.JavIntro.Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by VZhuchkovsky on 29.04.2015.
 */
public class Somellier {
    public static void main(String[] args){
        Vine bottle1 = new Vine (1995, 200);
        Vine bottle2 = new Vine (1995, 100);
        Integer i = 123;


        System.out.println("they are equal " + bottle1.equals(bottle2));
        System.out.println("1 greater than 2 " + (bottle1.compareTo(bottle2) > 0));

        List<Vine> list = new ArrayList<>();

        list.add(bottle1);
        list.add(bottle2);
        list.add(bottle1);
        System.out.println(list);

        Comparable vine = (Comparable) bottle1;

        Collections.sort(list);

        System.out.println(list);

        Comparator<Vine> orderByPrice = new VineComparator();

        Collections.sort(list, orderByPrice);

        System.out.println(list);


    }
}

package com.hillel.com.hillel.dataSctructures.hash;

import com.hillel.com.hillel.dataSctructures.MyHashSet;

/**
 * Created by VZhuchkovsky on 13.05.2015.
 */
public class HashMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie(2000, "Matrix", 1000000L);
        Movie movie2 = new Movie(2000, "Matrix 2", 2000000L);

        System.out.println(movie1.hashCode());
        System.out.println(movie2.hashCode());

        MyHashSet set = new MyHashSet();

        set.add(movie1);
        set.add(movie2);
        System.out.println("movie1 is in " + set.contains(movie1));
        System.out.println("movie2 is in " + set.contains(movie2));

        System.out.println(set);
    }
}

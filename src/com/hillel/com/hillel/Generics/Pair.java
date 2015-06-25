package com.hillel.com.hillel.Generics;

import java.io.ObjectOutputStream;

/**
 * Created by VZhuchkovsky on 25.06.2015.
 */
public class Pair <K,V>{ //T is link to the type
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst(){
        return first;
    }

    public V getSecond() {
        return second;
    }

}

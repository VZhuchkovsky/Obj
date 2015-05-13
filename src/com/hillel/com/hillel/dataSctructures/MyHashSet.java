package com.hillel.com.hillel.dataSctructures;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by VZhuchkovsky on 13.05.2015.
 */
public class MyHashSet {

    private int capacity = 4;
    private LinkedList<Object>[] array = new LinkedList[capacity];

    public MyHashSet(){
        for(int i = 0;i < array.length; i++){
            array[i] = new LinkedList<>();
        }
    }

    public void add(Object obj) {
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];
        list.add(obj);
    }

    public int getIndex(Object obj) {
        return Math.abs(obj.hashCode() % array.length);
    }

    public boolean contains(Object obj) {
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];

        return list.contains(obj);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}

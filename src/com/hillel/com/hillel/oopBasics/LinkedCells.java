package com.hillel.com.hillel.oopBasics;

/**
 * Created by VZhuchkovsky on 17.04.2015.
 */
public class LinkedCells {


    private Cell head;
    private int counter;
    private Cell tail;

    public void add(String value){
       if (head == null){
           head = new Cell(value);
       }
        if(tail == null){
            tail = head;
        }else {
            tail.setNext(new Cell(value));
        }

        counter++;
    }
    public String toString(){
        String result = "[";
        Cell current = head;
        while (current!= null){
            result += current.getValue();
            if(current.getNext() != null);{
                result +=", ";
            }
            current = current.getNext();
        }
        result +="]";
        return result;
    }
}

package com.hillel.com.hillel.Java.JavIntro.Comparison;

/**
 * Created by VZhuchkovsky on 29.04.2015.
 */
public class Vine implements Comparable<Vine>{
    private int year;
    private int price;

    public Vine(int year, int price){
        this.year =  year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vine year " + year + " price " + price;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){  //if(super.equals(obj)))
            return true;
        }

        if(!(obj instanceof Vine)){
            return false;
        }
        Vine other = (Vine) obj;

        return this.year == other.year && this.price == other.price;



    }
    @Override
    public int compareTo(Vine bottle2) {
        int result = this.year -  bottle2.year;
        if(result == 0){
            result = this.price - bottle2.price;
        }
        return result;
    }

    public int getPrice() {
        return price;
    }

    public String taste(){
        return "nothing special";
    }

    public int getYear() {
        return year;
    }
}

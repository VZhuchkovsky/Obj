package com.hillel.com.hillel.oopBasics;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by VZhuchkovsky on 10.04.2015.
 */
public class Cat {

    static final int pawCount = 4; //final чтобы нельзя было изменить константу

    private final String name;
    private int age;
    private Vaccine vaccines[] = new Vaccine[10];
    private int vaccineCount = 0;
    private String ownerName;

    public Cat(String name) {this(name, 0);}


    //Стандартный конструктор
    public Cat() {
        this("noname");
    }

    //Конструктор
    public Cat(String name, int age) {
        this.name = name;  //this обозначает что это ссылка на name под pub. class com.hillel.com.hillel.oopBasics.Cat
        this.age = age;
    }

    public String getName(){  //getter
       return name;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)  //setter
    {
        this.ownerName = ownerName;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0)
        {
            throw new RuntimeException("Incorrect age value:" + age);
        }
        this.age = age;
    }

    public Vaccine[] getVaccines() {
        return vaccines;
    }

    public void setVaccines(Vaccine[] vaccines) {
        this.vaccines = vaccines;
    }



    public String toString() {


       /*  //Initialization
        int i;
        if(new Random().nextBoolean())
        {
            i = 10;
        }else
        {
            i = 4;
        }

        System.out.println(i);
        */



        String result = "com.hillel.com.hillel.oopBasics.Cat";
        result += name + "";
        result += age + "years";
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(Vaccine vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() //лапы кота
    {
        return pawCount;
    }

    //инициализация статического метода
    public static void main(String[] args) {
        Cat cat = new Cat("sdf", 1);

    }

    public boolean equals(Object other) {

        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }

    }

}

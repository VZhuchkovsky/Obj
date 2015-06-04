package com.hillel.com.hillel.Serialization;

import java.io.*;

/**
 * Created by VZhuchkovsky on 04.06.2015.
 */
public class SerializationMain {
    public static void main(String[] args) {
     Car car /*= new Car("BMW")*/;

        //save(car);

        car = load();

        System.out.println(car);
    }

    private static Car load() {
        Car car = null;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Obj2/serializedCar.dat"))){
           car = (Car) inputStream.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return car;
    }

    private static void save(Car car) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Obj2/serializedCar.dat"))){
            outputStream.writeObject(car);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

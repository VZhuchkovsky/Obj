package com.hillel.com.hillel.Serialization;

import java.io.Serializable;


public class CarOwner implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
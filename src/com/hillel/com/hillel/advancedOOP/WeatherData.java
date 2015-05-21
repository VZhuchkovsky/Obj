package com.hillel.com.hillel.advancedOOP;

import java.util.ArrayList;
import java.util.List;


public class WeatherData {
    private Weather weather;

    private List<Updatable> updatables = new ArrayList<>();

    public void addObserver(Updatable observer){
        updatables.add(observer);
    }

    public void recieveData(int temperature, int humidity){
        weather = new Weather(temperature,humidity);

        measurementChanged();
    }

    public void measurementChanged(){
        for (Updatable observer : updatables){
            observer.update(weather);
        }
    }

}

package com.hillel.com.hillel.advancedOOP;

import com.hillel.com.hillel.advancedOOP.Displayable;
import com.hillel.com.hillel.advancedOOP.Updatable;
import com.hillel.com.hillel.advancedOOP.Weather;

public class CurrentWeatherDisplay implements Updatable, Displayable {
    private Weather weather;

    @Override
    public void update (Weather weather){
        this.weather = weather;
    }

    @Override
    public void display(){
        System.out.println("Current weather is: temperature " + weather.getTemperature() +
                ", humidity " + weather.getHumidity());
    }
}
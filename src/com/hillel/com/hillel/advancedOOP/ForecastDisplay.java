package com.hillel.com.hillel.advancedOOP;

import java.util.Random;


public class ForecastDisplay implements Updatable, Displayable{
    private Random random = new Random();
    private Weather forecastWeather;

    @Override
    public void update(Weather weather){
        forecastWeather = forecast(weather);
    }
    private Weather forecast(Weather weather){
        double ceed = random.nextDouble() * 0.5 + 0.75;
        int forecastTemp = (int) Math.round(weather.getTemperature()*ceed);
        int forecastHumidity = (int) Math.round(weather.getHumidity()*ceed);
        return new Weather(forecastTemp, forecastHumidity);
    }
    @Override
    public void display(){
        System.out.println("Forecast: temperature "+ forecastWeather.getTemperature() +
                ", humidity " + forecastWeather.getHumidity() );
    }
}
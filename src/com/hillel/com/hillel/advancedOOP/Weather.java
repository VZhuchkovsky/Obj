package com.hillel.com.hillel.advancedOOP;

/**
 * Created by VZhuchkovsky on 21.05.2015.
 */
public class Weather {
    private int temperature;
    private int humidity;

    public Weather(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
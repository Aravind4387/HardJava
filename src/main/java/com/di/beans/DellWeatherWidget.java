package com.di.beans;

public class DellWeatherWidget implements IWeatherFinder {

    @Override
    public double getWeather(String zipCode) {
        return 28;
    }
}

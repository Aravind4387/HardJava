package com.di.beans;

public class LenovoWeatherWidget implements IWeatherFinder {

    @Override
    public double getWeather(String zipCode) {
        return 37;
    }
}

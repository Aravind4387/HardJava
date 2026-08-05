package com.di.beans;

public class AppleWeatherWidget implements IWeatherFinder{


    @Override
    public double getWeather(String zipCode) {
        return 30;
    }
}

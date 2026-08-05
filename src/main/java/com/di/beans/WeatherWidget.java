package com.di.beans;

public class WeatherWidget {

    IWeatherFinder weatherFinder;
    public void showWeather(String zipCode){
        double temperature = 0.5;

        temperature = weatherFinder.getWeather(String zipCode);
        System.out.println("temperature : " + temperature);
    }
    public void setWeatherFinder(IWeatherFinder weatherFinder) {
        this.weatherFinder = weatherFinder;
    }
}




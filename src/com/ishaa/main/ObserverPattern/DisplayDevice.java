package com.ishaa.main.ObserverPattern;

public class DisplayDevice {
    public void showTemp(float temp){
        System.out.println("Current Temperature:" +temp+ "C");

    }
}

class WeatherStation{
    private float temperature;
    private DisplayDevice displayDevice;
}

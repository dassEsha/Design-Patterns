package com.ishaa.main.ObserverPattern;





class WeatherStation{
    private float temperature;
    private DisplayDevice displayDevice;

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temperature = temperature;
        notifyDevice();
    }
    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }

}

public class WithoutObserverPattern{
    public static void main(String[] args){
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);

        station.setTemperature(44);
        station.setTemperature(28);
    }
}

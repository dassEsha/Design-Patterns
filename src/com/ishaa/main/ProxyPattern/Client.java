package com.ishaa.main.ProxyPattern;

public class Client {
    public static void main(String[] args) {
//        Image img = new RealImage("flower.png");
//        Image img2 = new RealImage("star.png");
//        Image img3 = new RealImage("purple.jpg");

//        Here, the RealImage is loaded every time we create it
//        which can be inefficient if the image is not always required.

//        Applying Proxy Design Pattern

        Image img = new ProxyImage("flower.png");
        Image img2 = new ProxyImage("house.png");

//        The image is loaded lazily when needed,
//        Saving time and resourses if the image is never displayed.
        img.display(); //create RealImage + load + display
        img.display(); //display
    }
}

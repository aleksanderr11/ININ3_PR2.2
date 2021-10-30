package com.szymek.devices;

public abstract class Device  {
    public Device(String model, String producer, String color, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Device(String samsung, String producer, String color, String model, String producer1, String color1, int yearOfProduction) {
        this.model = model;
        this.producer = producer1;
        this.color = color1;
        this.yearOfProduction = yearOfProduction;
    }

    abstract public void tunOn();



    final String model;
    final String producer;
    final String color;

    final int yearOfProduction;
}

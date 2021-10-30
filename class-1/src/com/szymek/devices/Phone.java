package com.szymek.devices;

public class Phone extends Device implements Saleable{

    public Phone(String model, String producer, String color, int yearOfProduction) {
        super(model, producer, color, yearOfProduction);
    }

    @Override
    public void tunOn() {

    }

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}

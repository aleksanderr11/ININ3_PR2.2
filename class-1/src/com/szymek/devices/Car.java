package com.szymek.devices;

public class Car extends Device {

    public Car(String model, String producer, String color, int yearOfProduction, Double mileage, Boolean hasWinterTyres) {
        super(model, producer, color, yearOfProduction);
        this.mileage = mileage;
        this.hasWinterTyres = hasWinterTyres;
    }

    final Double mileage;
    final Boolean hasWinterTyres;
    Double value;




    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public void tunOn() {

    }
}

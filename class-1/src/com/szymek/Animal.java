package com.szymek;

import com.szymek.devices.Saleable;

public class Animal implements Saleable {


    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "mammal":
                this.weight = 10.0;
                break;
            case "bird":
                this.weight = 2.00;
                break;
            case "reptile":
                this.weight = 0.80;
                break;
            case "amphibian":
                this.weight = 0.60;
                break;
            case "fish":
                this.weight = 1.50;
                break;
            case "arthropods":
                this.weight = 0.30;
                break;
            default:
                this.weight = 1.00;
                break;
        }
    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("The animal is dead");
        } else {
            this.weight += 0.5;
        }
    }

    void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("The animal is dead");
        } else {
            this.weight -= 0.4;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}

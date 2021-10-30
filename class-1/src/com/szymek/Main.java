package com.szymek;

import com.szymek.devices.Car;

public class Main {

    public static void main(String[] args) {

        // task 1
        Animal ptysiek = new Animal("reptile");

        ptysiek.takeForAWalk();
        ptysiek.feed();
        ptysiek.feed();
        ptysiek.takeForAWalk();
        ptysiek.takeForAWalk();
        ptysiek.takeForAWalk();
        ptysiek.takeForAWalk();

        ptysiek.feed();
        ptysiek.takeForAWalk();

        // task 2
        Human szymek = new Human();
        Car coupe = new Car("TT Coupe", "Audi", "black", 10000.0, false);
        coupe.toString();

        szymek.setCar(coupe);

        // task 6
        Car mondeo1 = new Car("Mondeo", "Ford", "silver", 30000.0, true);
        Car mondeo2 = new Car("Mondeo", "Ford", "silver", 30000.0, true);
        mondeo1.equals(mondeo2);
    }
}

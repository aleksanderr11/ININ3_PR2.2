package com.szymek;

import com.szymek.devices.Car;
import com.szymek.devices.Device;
import com.szymek.devices.Phone;

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
        szymek.setSalary(999.0);
        Car coupe = new Car("TT Coupe", "Audi", "black", 1995, 10000.0, false );
        coupe.setValue(4359.0);
        coupe.toString();

        szymek.setCar(coupe);

        // task 6
        Car mondeo1 = new Car("Mondeo", "Ford", "silver", 1995, 10000.0,  true);
        Car mondeo2 = new Car("Mondeo", "Ford", "silver", 1995,10000.0 , true);
        mondeo1.equals(mondeo2);

        Phone nokia = new Phone("3310", " Nokia", "Blue", 2000 );

        Device washingmachine = new Device ( "Samsung","523232", "2020", color1);
    }
}

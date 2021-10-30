package com.szymek;

import com.szymek.devices.Car;

import java.util.Date;

public class Human {

    private Animal pet;
    private Car car;
    private Double salary;


    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary > car.getValue()){
            System.out.println("Success. The car was bought for cash.");
            this.car = car;
        } else if(car.getValue() < this.salary*12){
            System.out.println("Success. The car was bought on credit");
            this.car = car;
        } else {
            System.out.println("Go to college and find new job or go get a raise.");
        }
    }

    public Double getSalary() {
        Date date = new Date();
        System.out.println("Date: "+ System.currentTimeMillis()+"\nState: "+this.salary+" PLN");
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("salary cannot be negative");
        } else {
            System.out.println("The new data has been sent to the accountant." +
                    "\nDon't forget to pick up the annex to the contract from Mrs. Hania from the HR department." +
                    "\nZUS and US know about the change in salary.");
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}

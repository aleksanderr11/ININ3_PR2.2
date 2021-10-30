package com.szymek.devices;

public class Car {

    final String model;
    final String producer;
    final String color;
    final Double mileage;
    final Boolean hasWinterTyres;
    Double value;

    public Car(String model, String producer, String color, Double mileage, Boolean hasWinterTyres) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.mileage = mileage;
        this.hasWinterTyres = hasWinterTyres;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (producer != null ? !producer.equals(car.producer) : car.producer != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        if (mileage != null ? !mileage.equals(car.mileage) : car.mileage != null) return false;
        if (hasWinterTyres != null ? !hasWinterTyres.equals(car.hasWinterTyres) : car.hasWinterTyres != null)
            return false;
        return value != null ? value.equals(car.value) : car.value == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (hasWinterTyres != null ? hasWinterTyres.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", hasWinterTyres=" + hasWinterTyres +
                ", value=" + value +
                '}';
    }
}

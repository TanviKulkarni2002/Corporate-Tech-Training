package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String type) {
        super(name, modelName, type);
    }

    @Override
    public int maxSpeed(String type) {
        if ("SPORTS".equals(type)) {
            return 250; // Example speed for sports car
        } else if ("SEDAN".equals(type)) {
            return 190; // Example speed for sedan car
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Car Manufacturer: " + getName() + ", Model: " + getModelName() + ", Type: " + getType();
    }
}

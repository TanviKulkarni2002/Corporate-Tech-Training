package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String type) {
        super(name, modelName, type);
    }

    @Override
    public int maxSpeed(String type) {
        if ("SPORTS".equals(type)) {
            return 300; // Example speed for sports bike
        } else if ("CRUISER".equals(type)) {
            return 170; // Example speed for cruiser bike
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike Manufacturer: " + getName() + ", Model: " + getModelName() + ", Type: " + getType();
    }
}

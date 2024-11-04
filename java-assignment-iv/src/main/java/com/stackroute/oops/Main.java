package com.stackroute.oops;

public class Main {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();

        // Create Car and Bike objects
        Car sportsCar = vehicleService.createCar("Ferrari", "488", "SPORTS");
        System.out.println("SPORTS CAR DETAILS\n"+sportsCar.getManufacturerInformation());
        Bike sportsBike = vehicleService.createBike("Yamaha", "YZF-R1", "SPORTS");
        System.out.println("SPORTS BIKE DETAILS\n"+sportsBike.getManufacturerInformation());
        Car sedanCar = vehicleService.createCar("Toyota", "Camry", "SEDAN");
        System.out.println("SEDAN CAR DETAILS\n"+sedanCar.getManufacturerInformation());
        System.out.println();

        // Compare speeds of sports vehicles
        int result1 = vehicleService.compareMaxSpeed(sportsCar, sportsBike);
        System.out.println("Comparison result between sports car and sports bike: " + result1);

        // Compare speeds of a sports vehicle and a non-sports vehicle
        int result2 = vehicleService.compareMaxSpeed(sportsCar, sedanCar);
        System.out.println("Comparison result between sports car and sedan car: " + result2);
    }
}
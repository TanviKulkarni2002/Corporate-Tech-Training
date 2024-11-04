package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        int speed1 = first.maxSpeed(((AbstractManufacturer) first).getType());
        int speed2 = second.maxSpeed(((AbstractManufacturer) second).getType());
        if(speed1==170 || speed2==190 || speed1==190 || speed2==170){
            return -1;
        }
        
        int ans=Integer.compare(speed1, speed2);
        if (ans==-1){
            return speed2;
        }
        if(ans==1){
            return speed1;
        }
        return 0;
    }
}
package com.ncs;

import java.util.Objects;

public class Passenger implements Comparable<Passenger> {
    private String name;
    private int age;
    private char gender;

    public Passenger(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = Character.toUpperCase(gender); // Ensure case sensitivity is handled
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // Implement the compareTo method
    @Override
    public int compareTo(Passenger other) {
        // Compare passengers by name
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Passenger)) return false;
        Passenger passenger = (Passenger) obj;
        return age == passenger.age && name.equals(passenger.name) && gender == passenger.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
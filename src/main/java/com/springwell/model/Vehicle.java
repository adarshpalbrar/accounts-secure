package com.springwell.model;

public class Vehicle {
    private final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle[" +
                "name='" + name + '\'' +
                ']';
    }
}

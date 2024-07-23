package com.group5.Car.Parts;

public class Body {
    
    private double grossWeight;
    private double curbWeight;
    private double cargoCapacity;
    private double towingCapacity;
    private double seatingCapacity;
    private String color;
    private double fuelCapacity;


    public Body setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
        return this;
    }

    public Body setCurbWeight(double curbWeight) {
        this.curbWeight = curbWeight;
        return this;
    }

    public Body setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public Body setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
        return this;
    }

    public Body setSeatingCapacity(double seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public Body setColor(String color) {
        this.color = color;
        return this;
    }

    public Body setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }
    
}

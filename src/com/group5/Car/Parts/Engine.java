package com.group5.Car.Parts;

public class Engine {
    
    private double engineDisplacement;
    private int horsepower;
    private int torque;
    private String fuelType;
    private double cityFuelEconomy;
    private double highwayFuelEconomy;
    private String pistonConfiguration;


    public Engine setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
        return this;
    }

    public Engine setHorsepower(int horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public Engine setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public Engine setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Engine setCityFuelEconomy(double cityFuelEconomy) {
        this.cityFuelEconomy = cityFuelEconomy;
        return this;
    }

    public Engine setHighwayFuelEconomy(double highwayFuelEconomy) {
        this.highwayFuelEconomy = highwayFuelEconomy;
        return this;
    }

    public Engine setPistonConfiguration(String pistonConfiguration) {
        this.pistonConfiguration = pistonConfiguration;
        return this;
    }

}

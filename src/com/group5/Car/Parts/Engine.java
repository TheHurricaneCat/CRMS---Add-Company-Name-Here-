package com.group5.Car.Parts;

import com.group5.Car.Part;

public class Engine extends Part {
    
    private double engineDisplacement;
    private int horsepower;
    private int torque;
    private String fuelType;
    private double cityFuelEconomy;
    private double highwayFuelEconomy;
    private String pistonConfiguration;


    @Override
    public String[] getSpecs() {
        return new String[] {
            Double.toString(engineDisplacement),
            Integer.toString(horsepower),
            Integer.toString(torque),
            fuelType,
            Double.toString(cityFuelEconomy),
            Double.toString(highwayFuelEconomy),
            pistonConfiguration
        };
    }

    public Engine setType (String type) {
        this.type = type;
        return this;
    }

    public Engine setMaterial (String material) {
        this.material = material;
        return this;
    }
    
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

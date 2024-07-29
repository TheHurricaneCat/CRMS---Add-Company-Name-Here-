package com.group5.Car.Parts;

import com.group5.Car.Part;

public class Engine extends Part {
    
    private String pistonConfiguration;
    private double maxSpeed;
    private double maxRPM;
    private double zeroToHundredKMH;
    private double engineDisplacement;
    private int power;
    private int torque;
    private String fuelType;
    private double cityFuelEconomy;
    private double highwayFuelEconomy;


    @Override
    public String[] getSpecs() {
        return new String[] {
            pistonConfiguration,
            Double.toString(maxSpeed),
            Double.toString(maxRPM),
            Double.toString(zeroToHundredKMH),
            Double.toString(engineDisplacement),
            Integer.toString(power),
            Integer.toString(torque),
            fuelType,
            Double.toString(cityFuelEconomy),
            Double.toString(highwayFuelEconomy)
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

    public Engine setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Engine setMaxRPM(double maxRPM) {
        this.maxRPM = maxRPM;
        return this;
    }

    public Engine setZeroToHundredKMH(double zeroToHundredKMH) {
        this.zeroToHundredKMH = zeroToHundredKMH;
        return this;
    }

    public Engine setPistonConfiguration(String pistonConfiguration) {
        this.pistonConfiguration = pistonConfiguration;
        return this;
    }
    
    public Engine setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
        return this;
    }

    public Engine setPower(int power) {
        this.power = power;
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

    

}

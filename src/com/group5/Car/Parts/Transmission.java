package com.group5.Car.Parts;

public class Transmission {
    
    private String transmissionType;
    private int gearCount;
    private Boolean torqueConverter;


    public Transmission setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Transmission setGearCount(int gearCount) {
        this.gearCount = gearCount;
        return this;
    }

    public Transmission setTorqueConverter(Boolean torqueConverter) {
        this.torqueConverter = torqueConverter;
        return this;
    }
    
}

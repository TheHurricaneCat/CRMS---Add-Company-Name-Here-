package com.group5.Car.Parts;

import com.group5.Car.Part;

public class Drivetrain extends Part{
    
    private String wheelDriveType;
    private String transmissionType;
    private int gearCount;

    @Override
    public String[] getSpecs() {
        return new String[] {
            wheelDriveType,
            transmissionType,
            Integer.toString(gearCount)
        };
    }

    public Drivetrain setType (String type) {
        this.type = type;
        return this;
    }

    public Drivetrain setMaterial (String material) {
        this.material = material;
        return this;
    }

    public Drivetrain setWheelDriveType(String wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
        return this;
    }
    
    public Drivetrain setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Drivetrain setGearCount(int gearCount) {
        this.gearCount = gearCount;
        return this;
    }
    
}

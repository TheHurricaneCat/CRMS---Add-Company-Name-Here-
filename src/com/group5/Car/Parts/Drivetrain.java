package com.group5.Car.Parts;

import com.group5.Car.Part;

public class Drivetrain extends Part{
    
    private String wheelDriveType;
    private double finalDriveRatio;
    private double differentialRatio;


    @Override
    public String[] getSpecs() {
        return new String[] {
            wheelDriveType,
            Double.toString(finalDriveRatio),
            Double.toString(differentialRatio)
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

    public Drivetrain setFinalDriveRatio(double finalDriveRatio) {
        this.finalDriveRatio = finalDriveRatio;
        return this;
    }
    
    public Drivetrain setDifferentialRatio(double differentialRatio) {
        this.differentialRatio = differentialRatio;
        return this;
    }

    
}

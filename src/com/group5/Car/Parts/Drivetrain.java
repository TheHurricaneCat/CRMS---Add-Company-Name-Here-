package com.group5.Car.Parts;

public class Drivetrain {
    
    private String wheelDriveType;
    private double finalDriveRatio;
    private double differentialRatio;

    public Drivetrain setWheelDriveType(String wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
        return this;
    }
    public Drivetrain setFinalWheelDrive(double finalDriveRatio) {
        this.finalDriveRatio = finalDriveRatio;
        return this;
    }
    public Drivetrain setDifferentialRatio(double differentialRatio) {
        this.differentialRatio = differentialRatio;
        return this;
    }
    
}

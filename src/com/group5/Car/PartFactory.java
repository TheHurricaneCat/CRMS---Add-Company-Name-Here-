package com.group5.Car;

import com.group5.Car.Parts.Body;
import com.group5.Car.Parts.Drivetrain;
import com.group5.Car.Parts.Engine;
import com.group5.Car.Parts.Transmission;



public class PartFactory {
    

    static public Engine createEngine (double engineDisplacement, int horsepower, int torque, String fuelType, double cityFuelEconomy, double highwayFuelEconomy, String pistonConfiguration) {

        return new Engine()
            .setEngineDisplacement(engineDisplacement)
            .setHorsepower(horsepower)
            .setTorque(torque)
            .setFuelType(fuelType)
            .setCityFuelEconomy(cityFuelEconomy)
            .setHighwayFuelEconomy(highwayFuelEconomy)
            .setPistonConfiguration(pistonConfiguration);
        
    }


    static public Transmission createTransmission (String transmissionType, int gearCount, Boolean torqueConverter) {
        
        return new Transmission()
            .setTransmissionType(transmissionType)
            .setGearCount(gearCount)
            .setTorqueConverter(torqueConverter);

    }


    static public Drivetrain createDrivetrain (String wheelDriveType, double finalDriveRatio, double differentialRatio) {
        
        return new Drivetrain()
            .setWheelDriveType(wheelDriveType)
            .setFinalWheelDrive(finalDriveRatio)
            .setDifferentialRatio(differentialRatio);


    }


    static public Body createBody (double grossWeight, double curbWeight, double cargoCapacity, double towingCapacity, double seatingCapacity, String color, double fuelCapacity) {

        return new Body()
            .setGrossWeight(grossWeight)
            .setCurbWeight(curbWeight)
            .setCargoCapacity(cargoCapacity)
            .setTowingCapacity(towingCapacity)
            .setSeatingCapacity(seatingCapacity)
            .setColor(color)
            .setFuelCapacity(fuelCapacity);

    }


}

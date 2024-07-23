package com.group5.Car;

import com.group5.Car.Parts.Body;
import com.group5.Car.Parts.Drivetrain;
import com.group5.Car.Parts.Engine;
import com.group5.Car.Parts.Transmission;



public class PartFactory {
    

    static public Engine createEngine (String name, String material, double engineDisplacement, int horsepower, int torque, String fuelType, double cityFuelEconomy, double highwayFuelEconomy, String pistonConfiguration) {

        return new Engine()
            .setName(name)
            .setMaterial(material)
            .setEngineDisplacement(engineDisplacement)
            .setHorsepower(horsepower)
            .setTorque(torque)
            .setFuelType(fuelType)
            .setCityFuelEconomy(cityFuelEconomy)
            .setHighwayFuelEconomy(highwayFuelEconomy)
            .setPistonConfiguration(pistonConfiguration);
        
    }


    static public Transmission createTransmission (String name, String material, String transmissionType, int gearCount, Boolean torqueConverter) {
        
        return new Transmission()
            .setName(name)
            .setMaterial(material)
            .setTransmissionType(transmissionType)
            .setGearCount(gearCount)
            .setTorqueConverter(torqueConverter);

    }


    static public Drivetrain createDrivetrain (String name, String material, String wheelDriveType, double finalDriveRatio, double differentialRatio) {
        
        return new Drivetrain()
            .setName(name)
            .setMaterial(material)
            .setWheelDriveType(wheelDriveType)
            .setFinalWheelDrive(finalDriveRatio)
            .setDifferentialRatio(differentialRatio);


    }


    static public Body createBody (String name, String material, double grossWeight, double curbWeight, double cargoCapacity, double towingCapacity, double seatingCapacity, String color, double fuelCapacity) {

        return new Body()
            .setName(name)
            .setMaterial(material)
            .setGrossWeight(grossWeight)
            .setCurbWeight(curbWeight)
            .setCargoCapacity(cargoCapacity)
            .setTowingCapacity(towingCapacity)
            .setSeatingCapacity(seatingCapacity)
            .setColor(color)
            .setFuelCapacity(fuelCapacity);

    }


}

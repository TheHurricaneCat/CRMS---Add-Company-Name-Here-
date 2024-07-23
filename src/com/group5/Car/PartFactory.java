package com.group5.Car;


public interface PartFactory {
    

    public Part create ();


    /*
    public Engine initialize (String name, String material, double engineDisplacement, int horsepower, int torque, String fuelType, double cityFuelEconomy, double highwayFuelEconomy, String pistonConfiguration) {

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

    static public Drivetrain create (String name, String material, String wheelDriveType, double finalDriveRatio, double differentialRatio) {
        
        return new Drivetrain()
            .setName(name)
            .setMaterial(material)
            .setWheelDriveType(wheelDriveType)
            .setFinalWheelDrive(finalDriveRatio)
            .setDifferentialRatio(differentialRatio);


    }

    static public Body create (String name, String material, double grossWeight, double curbWeight, double cargoCapacity, double towingCapacity, double seatingCapacity, String color, double fuelCapacity) {

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

    static public Transmission create (String name, String material, String transmissionType, int gearCount, Boolean torqueConverter) {
        
        return new Transmission()
            .setName(name)
            .setMaterial(material)
            .setTransmissionType(transmissionType)
            .setGearCount(gearCount)
            .setTorqueConverter(torqueConverter);

    }
    */

}

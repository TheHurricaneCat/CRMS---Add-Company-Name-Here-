package com.group5.Car;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;

abstract public class CarDBHandler {

    static int id;
    
    static public void insertCar (Car car) throws IOException {

        FileWriter file = new FileWriter("CarDB.csv");
        BufferedWriter writer = new BufferedWriter(file);     
        String carInfo;

        carInfo =
            "\n" + car.getCarID()
            + "," + car.getName()
            + "," + car.getMake().getName()
            + "," + car.getMake().getCountry()
            + "," + car.getModel().getName()
            + "," + car.getModel().getModelYear();
        ;

        for (Part part : car.getParts()) {
            for (String spec : part.getSpecs()) {
                carInfo += "," + spec;
            }
        }

        writer.append(carInfo);
        writer.close();

    }
    
    static public Car getCar (String fileName) throws IOException {
        
        FileReader file = new FileReader(fileName + ".csv");
        BufferedReader reader = new BufferedReader(file);

        CarBuilder carbuilder = new CarBuilder();

        carbuilder
            .setCarID(Integer.parseInt(reader.readLine()))
            .setName(reader.readLine())
        ;
        Make make = new Make(reader.readLine(), reader.readLine());
        carbuilder
            .setMake(make)
            .setModel(new Model(reader.readLine(), make, Integer.parseInt(reader.readLine())))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(Double.parseDouble(reader.readLine()))
                .setHorsepower(Integer.parseInt(reader.readLine()))
                .setTorque(Integer.parseInt(reader.readLine()))
                .setFuelType(reader.readLine())
                .setCityFuelEconomy(Double.parseDouble(reader.readLine()))
                .setHighwayFuelEconomy(Double.parseDouble(reader.readLine()))
                .setPistonConfiguration(reader.readLine())
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType(reader.readLine())
                .setGearCount(Integer.parseInt(reader.readLine()))
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType(reader.readLine())
                .setFinalDriveRatio(Double.parseDouble(reader.readLine()))
                .setDifferentialRatio(Double.parseDouble(reader.readLine()))
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(Double.parseDouble(reader.readLine()))
                .setCurbWeight(Double.parseDouble(reader.readLine()))
                .setCargoCapacity(Double.parseDouble(reader.readLine()))
                .setTowingCapacity(Double.parseDouble(reader.readLine()))
                .setSeatingCapacity(Integer.parseInt(reader.readLine()))
                .setFuelCapacity(Double.parseDouble(reader.readLine()))
                .setColor(reader.readLine())
                .setBodyType(reader.readLine())
            )
        ;
        
        reader.close();
        return carbuilder.build();
    } 
    
}

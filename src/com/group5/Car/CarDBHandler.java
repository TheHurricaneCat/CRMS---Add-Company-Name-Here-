package com.group5.Car;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;

abstract public class CarDBHandler {

    static int id;
    
    static public void insertCar (Car car) throws IOException {

        String dbPath = "./src/carDB/";
        String fileName = car.getName() + ".txt";
        FileWriter file = new FileWriter(dbPath + fileName);
        BufferedWriter writer = new BufferedWriter(file);     
        String carInfo;

        carInfo =
            car.getCarID() + "\n" +
            car.getName() + "\n" +
            car.getMake().getName() + "\n" +
            car.getMake().getCountry() + "\n" +
            car.getModel().getName() + "\n" +
            car.getModel().getModelYear() + "\n";
        ;

        for (Part part : car.getParts()) {
            for (String spec : part.getSpecs()) {
                carInfo += spec + "\n";
            }
        }

        writer.write(carInfo);
        writer.close();

    }
    
    static public Car getCar (String fileName) throws IOException {
        
        String dbPath = "./src/carDB/";
        FileReader file = new FileReader(dbPath + fileName + ".txt");
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


    static public Car getCar (int id) throws IOException {

        File file = searchForCar(id);
        //JOptionPane.showMessageDialog(null, file.getAbsolutePath());
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

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


    private static File searchForCar (int id) throws IOException {

        File[] folder = new File("./src/carDB/").listFiles();
        for (File file : folder) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int readCarID = Integer.parseInt(br.readLine());
            //System.out.println(file.getName() + " " + readCarID + " ?= " + id + " " + (readCarID == id));
            if (readCarID == id) {
                //System.out.println("Yooo");
                br.close();
                return file;
            }
        }
        return null;

    }
    
}

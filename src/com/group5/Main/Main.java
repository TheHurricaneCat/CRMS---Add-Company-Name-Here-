package com.group5.Main;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.group5.Car.Car;
import com.group5.Car.CarBuilder;
import com.group5.Car.CarDBHandler;
import com.group5.Car.Make;
import com.group5.Car.Model;
import com.group5.Car.Part;
import com.group5.Car.PartFactory;
import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Make Honda = new Make("Honda", "Japan");

        
        CarBuilder carbuilder = new CarBuilder();

        carbuilder
            .setName("Honda Civic 1995")
            .setCarID(0)
            .setMake(Honda)
            .setModel(new Model("Civic", Honda, 1995))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(1.6)
                .setHorsepower(125)
                .setTorque(106)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(28)
                .setHighwayFuelEconomy(36)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Manual")
                .setGearCount(5)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(4.25)
                .setDifferentialRatio(4.25)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1420)
                .setCurbWeight(1036)
                .setCargoCapacity(11.1)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Milano Red")
                .setFuelCapacity(11.9)
                .setBodyType("Sedan")
            )
        ;

        Car myCar = carbuilder.build();

        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Car dbCar = CarDBHandler.getCar("Honda Civic 1995");

        String carInfo;

        carInfo =
            dbCar.getCarID() + "\n" +
            dbCar.getName() + "\n" +
            dbCar.getMake().getName() + "\n" +
            dbCar.getMake().getCountry() + "\n" +
            dbCar.getModel().getName() + "\n" +
            dbCar.getModel().getModelYear() + "\n";
        ;

        for (Part part : dbCar.getParts()) {
            for (String spec : part.getSpecs()) {
                carInfo += spec + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, carInfo);

    }

}

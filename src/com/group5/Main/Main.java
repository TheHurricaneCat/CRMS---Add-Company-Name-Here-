package com.group5.Main;

import java.io.IOException;

import com.group5.Car.Car;
import com.group5.Car.CarBuilder;
import com.group5.Car.CarDBHandler;
import com.group5.Car.Make;
import com.group5.Car.Model;
import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;

public class Main {

    public static void main(String[] args) {
        
        Make Honda = new Make("Honda", "Japan");
        Make Ford = new Make("Ford", "USA");
        Make Nissan = new Make("Nissan", "Japan");
        Make Subaru = new Make("Subaru", "Japan");
        Make Hyundai = new Make("Hyundai", "South Korea");
        Make Volkswagen = new Make("Volkswagen", "Germany");
        Make Mazda = new Make("Mazda", "Japan");
        Make Mercedes = new Make("Mercedes-Benz", "Germany");
        Make Chevrolet = new Make("Chevrolet", "USA");
        Make Dodge = new Make("Dodge", "USA");
        Make Kia = new Make("Kia", "South Korea");
        Make Chrysler = new Make("Chrysler", "USA");


        
        CarBuilder carbuilder = new CarBuilder();
        Car myCar;
        
        carbuilder
            .setName("Honda Civic 1995")
            .setMake(Honda)
            .setModel(new Model("Civic", Honda, 1995))
            .addPart(new EngineFactory().create()
                .setType("Engine")
                .setEngineDisplacement(1.6)
                .setHorsepower(125)
                .setTorque(106)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(28)
                .setHighwayFuelEconomy(36)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setType("Transmission")
                .setTransmissionType("Manual")
                .setGearCount(5)
            )
            .addPart(new DrivetrainFactory().create()
                .setType("Drivetrain")
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(4.25)
                .setDifferentialRatio(4.25)
            )
            .addPart(new BodyFactory().create()
                .setType("Body")
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

        myCar = carbuilder.build();
        try {
            CarDBHandler.addCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Car newCar = CarDBHandler.getCar(40);
            System.out.println(newCar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

       

    }

}

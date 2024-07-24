package com.group5.Main;

import com.group5.Car.CarBuilder;
import com.group5.Car.Make;
import com.group5.Car.Model;
import com.group5.Car.PartFactory;
import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;

public class Main {

    public static void main(String[] args) {
        
        Make Honda = new Make("Honda", "Japan");

        
        CarBuilder carbuilder = new CarBuilder();

        carbuilder
            .addPart(new EngineFactory().create()
                .setName("D16Z6")
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
                .setTorqueConverter(false)
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
            .setMake(Honda)
            .setModel(new Model("Civic DX/EX", Honda, 1995))
            .setCarID(0);


        
    }

}

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

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Ford Explorer 2021")
            .setCarID(2)
            .setMake(Ford)
            .setModel(new Model("Explorer", Ford, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(3.0)
                .setHorsepower(400)
                .setTorque(415)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(18)
                .setHighwayFuelEconomy(24)
                .setPistonConfiguration("V6")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(10)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.58)
                .setDifferentialRatio(3.58)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(2545)
                .setCurbWeight(2176)
                .setCargoCapacity(18.2)
                .setTowingCapacity(5600)
                .setSeatingCapacity(7)
                .setColor("Agate Black")
                .setFuelCapacity(20.2)
                .setBodyType("SUV")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Nissan Altima 2021")
            .setCarID(3)
            .setMake(Nissan)
            .setModel(new Model("Altima", Nissan, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(188)
                .setTorque(180)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(28)
                .setHighwayFuelEconomy(39)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("CVT")
                .setGearCount(1)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.52)
                .setDifferentialRatio(3.52)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1745)
                .setCurbWeight(1505)
                .setCargoCapacity(15.4)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Super Black")
                .setFuelCapacity(16.2)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        carbuilder
            .setName("Subaru Outback 2021")
            .setCarID(4)
            .setMake(Subaru)
            .setModel(new Model("Outback", Subaru, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(182)
                .setTorque(176)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(26)
                .setHighwayFuelEconomy(33)
                .setPistonConfiguration("Flat-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("CVT")
                .setGearCount(1)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.70)
                .setDifferentialRatio(3.70)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1975)
                .setCurbWeight(1640)
                .setCargoCapacity(32.5)
                .setTowingCapacity(2700)
                .setSeatingCapacity(5)
                .setColor("Crystal White Pearl")
                .setFuelCapacity(18.5)
                .setBodyType("Wagon")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Hyundai Elantra 2021")
            .setCarID(5)
            .setMake(Hyundai)
            .setModel(new Model("Elantra", Hyundai, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.0)
                .setHorsepower(147)
                .setTorque(132)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(33)
                .setHighwayFuelEconomy(43)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("IVT")
                .setGearCount(1)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.90)
                .setDifferentialRatio(3.90)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1500)
                .setCurbWeight(1340)
                .setCargoCapacity(14.2)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Phantom Black")
                .setFuelCapacity(14.8)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Volkswagen Jetta 2021")
            .setCarID(8)
            .setMake(Volkswagen)
            .setModel(new Model("Jetta", Volkswagen, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(1.4)
                .setHorsepower(147)
                .setTorque(184)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(30)
                .setHighwayFuelEconomy(41)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(8)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.84)
                .setDifferentialRatio(3.84)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1510)
                .setCurbWeight(1350)
                .setCargoCapacity(14.1)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Pure White")
                .setFuelCapacity(13.2)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Mazda CX-5 2021")
            .setCarID(9)
            .setMake(Mazda)
            .setModel(new Model("CX-5", Mazda, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(187)
                .setTorque(186)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(24)
                .setHighwayFuelEconomy(30)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.85)
                .setDifferentialRatio(3.85)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1830)
                .setCurbWeight(1580)
                .setCargoCapacity(29.9)
                .setTowingCapacity(2000)
                .setSeatingCapacity(5)
                .setColor("Soul Red Crystal Metallic")
                .setFuelCapacity(15.3)
                .setBodyType("SUV")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Mercedes-Benz C-Class 2021")
            .setCarID(11)
            .setMake(Mercedes)
            .setModel(new Model("C-Class", Mercedes, 2021))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.0)
                .setHorsepower(255)
                .setTorque(273)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(24)
                .setHighwayFuelEconomy(35)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(9)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("RWD")
                .setFinalDriveRatio(3.07)
                .setDifferentialRatio(3.07)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1885)
                .setCurbWeight(1600)
                .setCargoCapacity(12.6)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Iridium Silver Metallic")
                .setFuelCapacity(15.1)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }


        carbuilder
            .setName("Honda Accord 2014")
            .setCarID(15)
            .setMake(Honda)
            .setModel(new Model("Accord", Honda, 2014))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.4)
                .setHorsepower(190)
                .setTorque(162)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(27)
                .setHighwayFuelEconomy(36)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("CVT")
                .setGearCount(1)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(4.10)
                .setDifferentialRatio(4.10)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1575)
                .setCurbWeight(1450)
                .setCargoCapacity(15.8)
                .setTowingCapacity(1000)
                .setSeatingCapacity(5)
                .setColor("Modern Steel Metallic")
                .setFuelCapacity(17.2)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Chevrolet Malibu 2015")
            .setCarID(17)
            .setMake(Chevrolet)
            .setModel(new Model("Malibu", Chevrolet, 2015))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(196)
                .setTorque(186)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(24)
                .setHighwayFuelEconomy(36)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.63)
                .setDifferentialRatio(3.63)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1690)
                .setCurbWeight(1480)
                .setCargoCapacity(15.8)
                .setTowingCapacity(1000)
                .setSeatingCapacity(5)
                .setColor("Silver Ice Metallic")
                .setFuelCapacity(15.8)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Subaru Outback 2014")
            .setCarID(18)
            .setMake(Subaru)
            .setModel(new Model("Outback", Subaru, 2014))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(173)
                .setTorque(174)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(24)
                .setHighwayFuelEconomy(30)
                .setPistonConfiguration("Flat-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("CVT")
                .setGearCount(1)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.70)
                .setDifferentialRatio(3.70)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1900)
                .setCurbWeight(1630)
                .setCargoCapacity(35.5)
                .setTowingCapacity(2700)
                .setSeatingCapacity(5)
                .setColor("Crystal Black Silica")
                .setFuelCapacity(18.5)
                .setBodyType("Wagon")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Kia Sorento 2015")
            .setCarID(19)
            .setMake(Kia)
            .setModel(new Model("Sorento", Kia, 2015))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.4)
                .setHorsepower(191)
                .setTorque(181)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(20)
                .setHighwayFuelEconomy(27)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.65)
                .setDifferentialRatio(3.65)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1900)
                .setCurbWeight(1650)
                .setCargoCapacity(36.0)
                .setTowingCapacity(3500)
                .setSeatingCapacity(5)
                .setColor("Snow White Pearl")
                .setFuelCapacity(18.8)
                .setBodyType("SUV")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Chevrolet Equinox 2014")
            .setCarID(23)
            .setMake(Chevrolet)
            .setModel(new Model("Equinox", Chevrolet, 2014))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.4)
                .setHorsepower(182)
                .setTorque(172)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(22)
                .setHighwayFuelEconomy(32)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("AWD")
                .setFinalDriveRatio(3.53)
                .setDifferentialRatio(3.53)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1900)
                .setCurbWeight(1620)
                .setCargoCapacity(31.5)
                .setTowingCapacity(1500)
                .setSeatingCapacity(5)
                .setColor("Silver Ice Metallic")
                .setFuelCapacity(18.8)
                .setBodyType("SUV")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Ford Fusion 2015")
            .setCarID(22)
            .setMake(Ford)
            .setModel(new Model("Fusion", Ford, 2015))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.5)
                .setHorsepower(175)
                .setTorque(175)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(22)
                .setHighwayFuelEconomy(34)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.39)
                .setDifferentialRatio(3.39)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1650)
                .setCurbWeight(1550)
                .setCargoCapacity(16.0)
                .setTowingCapacity(1000)
                .setSeatingCapacity(5)
                .setColor("Ruby Red Metallic")
                .setFuelCapacity(16.0)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Chevrolet Silverado 2015")
            .setCarID(28)
            .setMake(Chevrolet)
            .setModel(new Model("Silverado", Chevrolet, 2015))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(4.3)
                .setHorsepower(285)
                .setTorque(305)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(18)
                .setHighwayFuelEconomy(24)
                .setPistonConfiguration("V6")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("RWD")
                .setFinalDriveRatio(3.42)
                .setDifferentialRatio(3.42)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(2540)
                .setCurbWeight(2100)
                .setCargoCapacity(61.0)
                .setTowingCapacity(7600)
                .setSeatingCapacity(3)
                .setColor("Summit White")
                .setFuelCapacity(23.0)
                .setBodyType("Pickup")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Dodge Charger 2015")
            .setCarID(26)
            .setMake(Dodge)
            .setModel(new Model("Charger", Dodge, 2015))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(3.6)
                .setHorsepower(292)
                .setTorque(260)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(19)
                .setHighwayFuelEconomy(31)
                .setPistonConfiguration("V6")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(8)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("RWD")
                .setFinalDriveRatio(2.65)
                .setDifferentialRatio(2.65)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1950)
                .setCurbWeight(1650)
                .setCargoCapacity(16.5)
                .setTowingCapacity(1000)
                .setSeatingCapacity(5)
                .setColor("Bright White Clear Coat")
                .setFuelCapacity(18.5)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Hyundai Sonata 2011")
            .setCarID(24)
            .setMake(Hyundai)
            .setModel(new Model("Sonata", Hyundai, 2011))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(2.4)
                .setHorsepower(198)
                .setTorque(184)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(22)
                .setHighwayFuelEconomy(35)
                .setPistonConfiguration("Inline-4")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(6)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("FWD")
                .setFinalDriveRatio(3.54)
                .setDifferentialRatio(3.54)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1500)
                .setCurbWeight(1390)
                .setCargoCapacity(16.4)
                .setTowingCapacity(0)
                .setSeatingCapacity(5)
                .setColor("Pearl White")
                .setFuelCapacity(18.5)
                .setBodyType("Sedan")
            )
        ;

        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        carbuilder
            .setName("Chrysler 300 2014")
            .setCarID(29)
            .setMake(Chrysler)
            .setModel(new Model("300", Chrysler, 2014))
            .addPart(new EngineFactory().create()
                .setEngineDisplacement(3.6)
                .setHorsepower(292)
                .setTorque(260)
                .setFuelType("Gasoline")
                .setCityFuelEconomy(19)
                .setHighwayFuelEconomy(31)
                .setPistonConfiguration("V6")
            )
            .addPart(new TransmissionFactory().create()
                .setTransmissionType("Automatic")
                .setGearCount(8)
            )
            .addPart(new DrivetrainFactory().create()
                .setWheelDriveType("RWD")
                .setFinalDriveRatio(2.65)
                .setDifferentialRatio(2.65)
            )
            .addPart(new BodyFactory().create()
                .setGrossWeight(1940)
                .setCurbWeight(1680)
                .setCargoCapacity(16.3)
                .setTowingCapacity(1000)
                .setSeatingCapacity(5)
                .setColor("Gloss Black")
                .setFuelCapacity(18.5)
                .setBodyType("Sedan")
            )
        ;
        
        myCar = carbuilder.build();
        try {
            CarDBHandler.insertCar(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        Car dbCar = CarDBHandler.getCar(29);
        //JOptionPane.showMessageDialog(null, dbCar.getName());

        
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

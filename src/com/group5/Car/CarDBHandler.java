package com.group5.Car;

import com.group5.Application.CarPanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Car.Parts.TransmissionFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JPanel;

abstract public class CarDBHandler {
    
    static public void preLoad(JPanel jPanel1) throws FileNotFoundException, IOException {
        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");
        
        ArrayList<Car> carList = new ArrayList<>();
        
        while (reader.hasNext()) {
            String[] info = reader.next().split(",");
            carList.add(getCar(Integer.parseInt(info[0])));
        }
        
        //preload the data
        for (Object car : carList) {
            // when adding new car wrap carPanel with another panel
            JPanel panel = new JPanel();
            panel.setBackground(new Color(0, 0, 0, 0));
            CarPanel subPanel = new CarPanel(jPanel1, (Car) car);
            subPanel.setPreferredSize(new Dimension(177, 186));
            panel.add(subPanel);
            jPanel1.add(panel);
            jPanel1.revalidate();
            jPanel1.repaint();
        }
        //clean up preloaded temp data
        //carList.clear();
    }
    
    static public void addCar (Car car) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("CarDB.csv", true));

        String carInfo;
        carInfo =
            ""+findNewID()
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

        writer.println(carInfo);
        writer.flush();
        writer.close();
    }


    
    static public Car getCar (int id) throws IOException {
        
        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");

        while (reader.hasNext()) {
            String[] info = reader.next().split(",");
            if (Integer.parseInt(info[0]) == id) {
                reader.close();
                return parseData(info);
            }
        }

        System.out.println("no car found");
        reader.close();
        return null;
    } 



    static public void editCar (int id, Car car) throws FileNotFoundException {

        String newRecord = "";

        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");

        while (reader.hasNext()) {
            String line = reader.next();
            int carID = 0;
            try { 
                carID = Integer.parseInt(line.split(",")[0]);
            } catch (Exception e) {}
            String carInfo = 
                ""+id
                + "," + car.getName()
                + "," + car.getMake().getName()
                + "," + car.getMake().getCountry()
                + "," + car.getModel().getName()
                + "," + car.getModel().getModelYear();
            for (Part part : car.getParts()) {
                for (String spec : part.getSpecs()) {
                    carInfo += "," + spec;
                }
            }
            //System.out.println(id + " == " + carID + " " + (id == carID));
            newRecord += (id != carID)? line : carInfo;
            newRecord += "\n";
        }
        reader.close();

        try {
            FileWriter fw = new FileWriter(new File("CarDB.csv"));
            //System.out.println("Editing car record...");
            //JOptionPane.showMessageDialog(null, newRecord);
            fw.write(newRecord);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    static public void deleteCar (int id) throws FileNotFoundException {

        String newRecord = "";

        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");

        while (reader.hasNext()) {
            String line = reader.next();
            int carID = 0;
            try { 
                carID = Integer.parseInt(line.split(",")[0]);
            } catch (Exception e) {}
            newRecord += (id != carID)? line : "DELETED";
            newRecord += "\n";
        }
        reader.close();

        try {
            FileWriter fw = new FileWriter(new File("CarDB.csv"));
            //System.out.println("Editing car record...");
            //JOptionPane.showMessageDialog(null, newRecord);
            fw.write(newRecord);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    static private Car parseData (String[] info) {

        CarBuilder carbuilder = new CarBuilder();
        
        Make make = new Make(info[2],info[3]);

        carbuilder
            .setCarID(Integer.parseInt(info[0]))
            .setName(info[1])
            .setMake(make)
            .setModel(new Model(info[4], make, Integer.parseInt(info[5])))
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

        return carbuilder.build();
    }
    


    private static int findNewID () throws FileNotFoundException {

        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");
        int newID = 0;

        while (reader.hasNext()) {
            reader.next();
            newID++;
        }

        reader.close();
        return newID;
    }
}

package com.group5.Car;

import com.group5.Application.CarPanel;
import com.group5.Car.Parts.BodyFactory;
import com.group5.Car.Parts.DrivetrainFactory;
import com.group5.Car.Parts.EngineFactory;
import com.group5.Login.UserDBHandler;
import com.group5.User.Customer;
import com.group5.User.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

abstract public class CarDBHandler {
    
    static public void generateReport(DefaultTableModel tableModel) throws IOException {
        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");
        
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<String> recordList = new ArrayList();
        
        while (reader.hasNext()) {
            recordList.add(reader.next());
        }
        
        for (String s : recordList) {
            if (!s.contains("DELETED")) {
                String id = s.split(",")[0];
                carList.add(getCar(Integer.parseInt(id)));
                //System.out.println(s);
            }
        }
        
        //load data to report window
        for (Car car : carList) {
            String[] attributes = {
                Integer.toString(car.getCarID()),
                car.getName(),
                "15 days",
                "P15.00/day",
                "Available",
            };
            tableModel.addRow(attributes);
        }
    }
    
    static public String generateFilteredReport(DefaultTableModel tableModel, String filter) throws FileNotFoundException, IOException {
        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");
        
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<String> recordList = new ArrayList();
        
        while (reader.hasNext()) {
            recordList.add(reader.next());
        }
        
        int attributeIndex = -1;
        
        for (String s : recordList) {
            String lowerS = s.toLowerCase();
            String lowerFilter = filter.toLowerCase();

            if (!lowerS.contains("deleted") && lowerS.contains(lowerFilter)) {
                String id = s.split(",")[0];

                carList.add(getCar(Integer.parseInt(id)));

                if (attributeIndex == -1) {
                    String[] reS = s.split(",");
                    for (int i = 0; i < reS.length; i++) {
                        if (reS[i].toLowerCase().equals(lowerFilter)) {
                            attributeIndex = i;
                            break;
                        }
                    }
                }
            }
        }
        
        //load data to report window
        for (Car car : carList) {
            String[] attributes = {
                Integer.toString(car.getCarID()),
                car.getName(),
                "15 days",
                "P15.00/day",
                "Available",
            };
            tableModel.addRow(attributes);
        }
        
        String[] category = {
            "ID",
            "Car Name",
            "Brand",
            "Country",
            "Model",
            "Year",
            "Engine Displacement",
            "Horsepower", 
            "Torque",
            "Fuel Type",
            "City Fuel Eco",
            "Highway Fuel Eco",
            "Piston Configuration",
            "Transmission Type",
            "Gear Count",
            "Wheel Drive Type",
            "Final Drive Ratio",
            "Differential Ratio",
            "Gross Weight",
            "Curb Weight",
            "Cargo Capacity",
            "Towing Capacity",
            "Seating Capacity",
            "Fuel Capacity",
            "Color",
            "Body Type",
        };
        if (attributeIndex != -1)
            return category[attributeIndex];
        else 
            return "Not found";
    }
    
    static public void reload(JPanel panel) throws IOException {
        Component[] components = panel.getComponents();
        for (Component c : components) {
            panel.remove(c);
        }
        preLoad(panel);
    }
    
    static public void preLoad(JPanel containerPanel) throws FileNotFoundException, IOException, NumberFormatException {
        
        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");
        
        
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<String> recordList = new ArrayList();
        
        while (reader.hasNext()) {
            recordList.add(reader.next());
        }
        
        for (String s : recordList) {
            
            if (!s.equalsIgnoreCase("DELETED")) {
                String id = s.split(",")[0];
                carList.add(getCar(Integer.parseInt(id)));
                //System.out.println(s);
            }

        }
        
        //preload the data
        for (Car car : carList) {
            if (car == null) continue;
            // when adding new car wrap carPanel with another panel
            JPanel panel = new JPanel();
            panel.setBackground(new Color(0, 0, 0, 0));
            CarPanel subPanel = new CarPanel(panel, car);
            subPanel.setPreferredSize(new Dimension(177, 186));
            panel.add(subPanel);
            containerPanel.add(panel);
            containerPanel.revalidate();
            containerPanel.repaint();
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
            + "," + car.getModel().getModelYear()
            + "," + car.getLicensePlate()
            + "," + Boolean.toString(car.getStatus().isRented())
            + "," + ((car.getStatus().getOwner() != null)? car.getStatus().getOwner().getUsername() : "Unowned")
            + "," + ((car.getStatus().getPrice() != null)? car.getStatus().getPrice().getRentPricePerDay() : 0)
            + "," + car.getStatus().getRentDurationDays()
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
            if (info[0].equalsIgnoreCase("DELETED")) continue;
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
        Boolean foundCar = false;

        Scanner reader = new Scanner(new File("CarDB.csv"));
        reader.useDelimiter("[\n]");

        while (reader.hasNext()) {
            String line = reader.next();
            int carID = 0;
            try { 
                carID = Integer.parseInt(line.split(",")[0]);
            } catch (Exception e) {}
            if (id != carID) {
                newRecord += line + "\n";
            } else {
                newRecord += "DELETED\n";
                foundCar = true;
            }
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
        
        if (foundCar) {
            JOptionPane.showMessageDialog(null, "Car Deleted Successfuly!");
        } else {
            JOptionPane.showMessageDialog(null, "Car is not in records...");
        }

    }



    static private Car parseData (String[] info) {
        
        
        Make make = new Make(info[2], info[3]);
        RentStatus status;
        if (info[7].equalsIgnoreCase("false")) {
            status = new RentStatus(new Price(Double.parseDouble(info[9])));
        } else {
            Customer owner = (Customer) UserDBHandler.getActiveUser(info[8]);
            Price price = new Price(Double.parseDouble(info[9]));
            int rentDurationDays = Integer.parseInt(info[10]);
            status = new RentStatus((Customer)owner, price, rentDurationDays);
        }

        
        CarBuilder carbuilder = new CarBuilder();
        carbuilder
            .setCarID(Integer.parseInt(info[0]))
            .setName(info[1])
            .setMake(make)
            .setModel(new Model(info[4], make, Integer.parseInt(info[5])))
            .setPlate(info[6])
            .setStatus(new RentStatus(status))
            .addPart(new BodyFactory().create()
                .setBodyWeight(Double.parseDouble(info[11]))
                .setBodyLength(Double.parseDouble(info[12]))
                .setBodyWidth(Double.parseDouble(info[13]))
                .setCargoCapacity(Double.parseDouble(info[14]))
                .setTowingCapacity(Double.parseDouble(info[15]))
                .setSeatingCapacity(Integer.parseInt(info[16]))
                .setFuelCapacity(Double.parseDouble(info[17]))
                .setColor(info[18])
                .setBodyType(info[19])
            ).addPart(new DrivetrainFactory().create()
                .setWheelDriveType(info[20])
                .setTransmissionType(info[21])
                .setGearCount(Integer.parseInt(info[22]))
            ).addPart(new EngineFactory().create()
                .setPistonConfiguration(info[23])
                .setMaxSpeed(Double.parseDouble(info[24]))
                .setMaxRPM(Double.parseDouble(info[25]))
                .setZeroToHundredKMH(Double.parseDouble(info[26]))
                .setEngineDisplacement(Double.parseDouble(info[27]))
                .setPower(Integer.parseInt(info[28]))
                .setTorque(Integer.parseInt(info[29]))
                .setFuelType(info[30])
                .setCityFuelEconomy(Double.parseDouble(info[31]))
                .setHighwayFuelEconomy(Double.parseDouble(info[32]))
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

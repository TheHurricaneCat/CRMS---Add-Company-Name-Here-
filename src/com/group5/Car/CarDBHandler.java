package com.group5.Car;

import com.group5.Application.CarPanel;
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

abstract public class CarDBHandler {
    
    static public void reload(JPanel jpanel1) throws IOException {
        Component[] components = jpanel1.getComponents();
        //remove all components
        for (Component c : components) {
            jpanel1.remove(c);
        }
        preLoad(jpanel1);
    }
    
    static public void preLoad(JPanel jPanel1) throws FileNotFoundException, IOException, NumberFormatException {
        
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
        
        //preload the data
        for (Car car : carList) {
            // when adding new car wrap carPanel with another panel
            JPanel panel = new JPanel();
            panel.setBackground(new Color(0, 0, 0, 0));
            CarPanel subPanel = new CarPanel(jPanel1, car);
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

        return null;
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

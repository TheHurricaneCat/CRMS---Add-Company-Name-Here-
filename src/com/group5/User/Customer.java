/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

import com.group5.Application.CustomerPanel;
import com.group5.Car.Car;
import java.util.ArrayList;

/**
 *
 * @author Josefe Gillego
 */
public class Customer extends User{
    
    private ArrayList<Integer> carIDs;
    
    public Customer(String username, String password) {
        super(username, password, 1);
        this.carIDs = new ArrayList<>();
    }
    
    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder(super.getDetails());
        for (int carID : carIDs) {
            details.append(":").append(carID);
        }
        return details.toString();
    }
    
    public void addCarID(int carID) {
        if (!carIDs.contains(carID)) {
            carIDs.add(carID);
        }
    }
    
    public void removeCarID(int carID) {
        carIDs.remove(Integer.valueOf(carID));
    }
    
    @Override
    public void openGUI() {
        CustomerPanel cPanel = new CustomerPanel(this);
        cPanel.setVisible(true);
    }
}

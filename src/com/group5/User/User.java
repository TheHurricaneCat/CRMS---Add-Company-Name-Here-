/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Josefe Gillego
 */
public class User implements IUser {
    private String username;
    private String password;
    private int authority; //0 - employee/admin, 1 - customer
    private List<Integer> carIDs;

    public User(String username, String password, int authority) {
        this.username = username;
        this.password = password;
        this.authority = authority;
        this.carIDs = new ArrayList<Integer>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAuthority() {
        return authority;
    }
    
    public String getDetails() {
        String carIDsStr = carIDs.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(":"));
        return username + ":" + password + ":" + authority + (carIDsStr.isEmpty() ? "" : ":" + carIDsStr);
    }
    
    public void addCarID(int carID) {
        carIDs.add(carID);
    }

    public void removeCarID(int carID) {
        carIDs.remove(Integer.valueOf(carID));
    }


    public void openGUI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

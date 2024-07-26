/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

/**
 *
 * @author Josefe Gillego
 */
public class User implements IUser {
    private String username;
    private String password;
    private int authority; //0 - employee/admin, 1 - customer

    public User(String username, String password, int authority) {
        this.username = username;
        this.password = password;
        this.authority = authority;
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
        return username + ":" + password + ":" + authority;
    }

    public void openGUI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

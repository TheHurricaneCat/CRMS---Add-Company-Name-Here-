/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

import com.group5.Application.CustomerPanel;

/**
 *
 * @author Josefe Gillego
 */
public class Customer extends User{
    
    
    public Customer(String username, String password) {
        super(username, password);
    }
    
    @Override
    public void openGUI() {
        CustomerPanel cPanel = new CustomerPanel();
        cPanel.setVisible(true);
    }
}

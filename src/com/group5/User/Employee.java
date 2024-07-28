/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

import java.io.IOException;

import com.group5.Application.CustomerPanel;
import com.group5.Application.EmployeePanel;

/**
 *
 * @author Josefe Gillego
 */
public class Employee extends User{

    public Employee(String username, String password) {
        super(username, password, 0);
    }
   
    @Override
    public void openGUI() {
        EmployeePanel ePanel;
        try {
            ePanel = EmployeePanel.getInstance(this);
            ePanel.setVisible(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

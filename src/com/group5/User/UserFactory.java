/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.User;

/**
 *
 * @author Josefe Gillego
 */
public class UserFactory {
    public static User createUser(String userType, String username, String password) {
        switch (userType) {
            case "0":
                return new Employee(username, password);
            case "1":
                return new Customer(username, password);
            // Add more cases as needed
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
    }
}

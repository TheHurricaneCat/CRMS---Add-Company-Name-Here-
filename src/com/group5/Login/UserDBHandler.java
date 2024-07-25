/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group5.Login;

import com.group5.User.User;
import com.group5.User.UserFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Josefe Gillego
 */
public class UserDBHandler {
    private File db = new File("src/com/group5/Login/db.txt");
    // maps (hash maps) are basically arrays but each element has 2 value slots
    private /*final*/ Map<String, User> activeUsers = new HashMap<>();
    
    public void createDb() {
        try {
            if(!db.createNewFile()) {
                System.out.println("File already exists");
                JOptionPane.showMessageDialog(null, "Database already exists", "Database Handler", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // this function ensures that only one instance of a particular user is active in runtime
    public void loginUser(String authority, String username, String password) {
        User user = UserFactory.createUser(authority, username, password);
        activeUsers.put(username, user);
        user.openGUI();
    }
    
    public void logoutUser(String username) {
        User user = activeUsers.get(username);
        if (user != null) {
            //user.saveData(); implement later
            activeUsers.remove(user);
        }
    }
    
    public void recordUser(User newUser) throws IOException {
        try (FileWriter writer = new FileWriter(db, true)) {
            writer.write(newUser.getDetails() + "\n");
            System.out.println(newUser.toString() + " processed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String verifyUser(String username, char[] password) {
        String passStr = new String(password);
        try (BufferedReader reader = new BufferedReader(new FileReader(db))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] slice = line.split(":");
                if (slice[0].equals(username) && slice[1].equals(passStr)) {
                    return "1:" + slice[2];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "0";
    }
    
    public boolean userExists(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(db))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] slice = line.split(":");
                if (slice[0].equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

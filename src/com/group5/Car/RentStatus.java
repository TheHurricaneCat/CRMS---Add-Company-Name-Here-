package com.group5.Car;

import javax.swing.JOptionPane;

import com.group5.User.Customer;
import com.group5.User.User;

public class RentStatus {
    
    private Boolean rented;
    private User owner;
    private Price price;
    private int rentDurationDays;
    

    public RentStatus (RentStatus status) {
        this.rented = status.isRented();
        this.owner = status.getOwner();
        this.price = status.getPrice();
        this.rentDurationDays = status.getRentDurationDays();
    }


    public RentStatus (Price price) {
        freeUp();
        setPrice(price);
    }

    public RentStatus (User owner, Price price, int rentDurationDays) {
        this.owner = owner;
        this.price = price;
        this.rentDurationDays = rentDurationDays;
    }
    
    public void rentTo(User user, int rentDurationDays){
        if (!rented && user == null) {
            this.rented = true;
            this.owner = user;
            this.rentDurationDays = rentDurationDays;
        } else {
            JOptionPane.showMessageDialog(null, "Car is unavailable for rent...");
        }
    }

    public void setPrice (Price price) {
        this.price = price;
    }

    public void freeUp(){
        this.rented = false;
        this.owner = null;
        this.price = null;
        this.rentDurationDays = 0;
    }


    public Boolean isRented () {
        return rented;
    }

    public User getOwner () {
        return owner;
    }

    public Price getPrice () {
        return price;
    }

    public int getRentDurationDays () {
        return rentDurationDays;
    }
    
}

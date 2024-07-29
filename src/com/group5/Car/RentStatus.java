package com.group5.Car;

import javax.swing.JOptionPane;

import com.group5.User.Customer;

public class RentStatus {
    
    private Boolean rented;
    private Customer owner;
    private Price price;
    
    public void rentTo(Customer owner, Price price){
        if (!rented && owner == null) {
            this.rented = true;
            this.owner = owner;
            this.price = price;
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
    }


    public Boolean isRented () {
        return rented;
    }

    public Customer getOwner () {
        return owner;
    }

    public Price getPrice () {
        return price;
    }
    
}

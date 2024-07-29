package com.group5.Car;

import javax.swing.JOptionPane;

import com.group5.User.Customer;

public class RentStatus {
    
    private Boolean rented;
    private Customer owner;
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
    
    public RentStatus (Price price, int rentDurationDays) {
        freeUp();
        setPrice(price);
        this.rentDurationDays = rentDurationDays;
    }
    
    public void rentTo(Customer owner, int rentDurationDays){
        if (!rented && owner == null) {
            this.rented = true;
            this.owner = owner;
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

    public Customer getOwner () {
        return owner;
    }

    public Price getPrice () {
        return price;
    }

    public int getRentDurationDays () {
        return rentDurationDays;
    }
    
}

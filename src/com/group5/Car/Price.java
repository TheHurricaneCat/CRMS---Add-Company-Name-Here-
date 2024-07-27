package com.group5.Car;

public class Price {
    
    double totalPrice;
    double partialPrice;
    double rentPricePerDay;
    int rentDuration;

    public Price (double rentPricePerDay, int rentDuration) {
        this.rentPricePerDay = rentPricePerDay;
        this.rentDuration = rentDuration;
        calculateTotalPrice();
    }

    public void calculateTotalPrice () {
        totalPrice = rentPricePerDay * rentDuration;
    }

    public void calculatePartialPrice (int days) {
        partialPrice = rentPricePerDay * days;
    }

}

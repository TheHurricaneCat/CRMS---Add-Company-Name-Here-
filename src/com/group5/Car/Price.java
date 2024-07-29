package com.group5.Car;

public class Price {
    
    private double rentPricePerDay;
    int rentDuration;

    public Price (double rentPricePerDay, int rentDuration) {
        this.rentPricePerDay = rentPricePerDay;
        this.rentDuration = rentDuration;
        calculateTotalPrice();
    }

    public double calculateTotalPrice () {
        return rentPricePerDay * rentDuration;
    }

    public double calculatePartialPrice (int days) {
        return rentPricePerDay * days;
    }

}

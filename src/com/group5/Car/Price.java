package com.group5.Car;

public class Price {
    
    private double rentPricePerDay;
    
    public Price (double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public double calculatePrice (int days) {
        return rentPricePerDay * days;
    }

    public double getRentPricePerDay () {
        return rentPricePerDay;
    }

}

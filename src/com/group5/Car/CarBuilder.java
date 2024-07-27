package com.group5.Car;

import java.util.ArrayList;

public class CarBuilder {

    private String name;
    private int carID;
    private Make make;
    private Model model;
    private ArrayList<Part> part = new ArrayList<>();
    private Price price;

    public CarBuilder setName (String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setCarID (int carID) {
        this.carID = carID;
        return this;
    }

    public CarBuilder setMake (Make make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel (Model model) {
        this.model = model;
        return this;
    }

    public CarBuilder addPart (Part part) {
        this.part.add(part);
        return this;
    }

    public CarBuilder setPrice (Price price) {
        this.price = price;
        return this;
    }

    public CarBuilder setPrice (double rentPricePerDay, int rentDuration) {
        this.price = new Price(rentPricePerDay, rentDuration);
        return this;
    }

    public Car build () {
        return new Car(name, carID, make, model, part, price);
    }

}
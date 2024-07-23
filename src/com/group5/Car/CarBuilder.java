package com.group5.Car;

import java.util.ArrayList;

public class CarBuilder {

    private int carID;
    private Make make;
    private Model model;
    private Specifications specs;
    private ArrayList<Part> part = new ArrayList<>();

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

    public CarBuilder setSpecs (Specifications specs) {
        this.specs = specs;
        return this;
    }

    public CarBuilder addPart (Part part) {
        this.part.add(part);
        return this;
    }

    public Car build () {
        return new Car(carID, make, model, specs, part);
    }

}
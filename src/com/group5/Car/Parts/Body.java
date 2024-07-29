package com.group5.Car.Parts;

import com.group5.Car.Part;
import java.awt.Color;

public class Body extends Part{
    
    private double bodyWeight;
    private double bodyLength;
    private double bodyWidth;
    private double cargoCapacity;
    private double towingCapacity;
    private int seatingCapacity;
    private double fuelCapacity;
    private String color;
    private String bodyType;


    @Override
    public String[] getSpecs() {
        return
            new String[] {
                Double.toString(bodyWeight),
                Double.toString(bodyLength),
                Double.toString(bodyWidth),
                Double.toString(cargoCapacity),
                Double.toString(towingCapacity),
                Integer.toString(seatingCapacity),
                Double.toString(fuelCapacity),
                color,
                bodyType
            };
    }

    public Body setType (String type) {
        this.type = type;
        return this;
    }

    public Body setMaterial (String material) {
        this.material = material;
        return this;
    }
    
    public Body setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
        return this;
    }

    public Body setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
        return this;
    }

    public Body setBodyWidth(double bodyWidth) {
        this.bodyWidth = bodyWidth;
        return this;
    }

    public Body setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public Body setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
        return this;
    }

    public Body setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public Body setColor(String color) {
        this.color = color;
        return this;
    }

    public Body setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    public Body setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }


}

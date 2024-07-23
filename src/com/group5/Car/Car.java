package com.group5.Car;

import java.util.ArrayList;

public class Car {
    
    private int carID;
    private Make make;
    private Model model;
    private Specifications specs;
    private ArrayList<Part> part = new ArrayList<>();

    public String getName() {
        return make.getName() + " " + model.getName();
    }
    
}

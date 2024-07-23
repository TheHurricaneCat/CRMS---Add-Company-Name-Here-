package com.group5.Car;

public class Model {
    
    private String name;
    private Make manufacturer;
    private int modelYear;


    public Model (String name, Make manufacturer, int modelYear) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.modelYear = modelYear;
    }


    public String getName() {
        return name;
    }
    
}

package com.group5.Car;

public abstract class Part {
    
    protected String type;
    protected String material;

    abstract public Part setType (String type);
    abstract public Part setMaterial (String material);
    abstract public String[] getSpecs ();
    
}
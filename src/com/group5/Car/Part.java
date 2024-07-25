package com.group5.Car;

public abstract class Part {
    
    protected String name;
    protected String material;

    abstract public Part setName (String name);
    abstract public Part setMaterial (String material);
    abstract public String[] getSpecs ();
    
}
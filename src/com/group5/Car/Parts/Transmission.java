package com.group5.Car.Parts;

import com.group5.Car.Part;

public class Transmission extends Part {
    
    private String transmissionType;
    private int gearCount;
    //private Boolean torqueConverter;


    @Override
    public String[] getSpecs() {
        return new String[] {
            transmissionType,
            Integer.toString(gearCount)
        };
    }

    public Transmission setType (String type) {
        this.type = type;
        return this;
    }

    public Transmission setMaterial (String material) {
        this.material = material;
        return this;
    }
    
    public Transmission setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Transmission setGearCount(int gearCount) {
        this.gearCount = gearCount;
        return this;
    }

}

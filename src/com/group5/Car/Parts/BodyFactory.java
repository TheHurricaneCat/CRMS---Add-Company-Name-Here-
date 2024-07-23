package com.group5.Car.Parts;

import com.group5.Car.PartFactory;

public class BodyFactory implements PartFactory {

    
    @Override
    public Body create() {
        
        return new Body();

    }


}

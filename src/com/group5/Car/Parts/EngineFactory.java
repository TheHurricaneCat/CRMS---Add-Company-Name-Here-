package com.group5.Car.Parts;

import com.group5.Car.PartFactory;

public class EngineFactory implements PartFactory {


    @Override
    public Engine create () {
        
        return new Engine();

    }

    
}

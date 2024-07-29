package com.group5.Car.Parts;

import com.group5.Car.PartFactory;

public class TransmissionFactory implements PartFactory  {

    @Override
    public Transmission create() {
        
        return new Transmission();

    }


}

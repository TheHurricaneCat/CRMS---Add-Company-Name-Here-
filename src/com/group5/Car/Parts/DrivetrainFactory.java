package com.group5.Car.Parts;

import com.group5.Car.PartFactory;

public class DrivetrainFactory implements PartFactory  {


    @Override
    public Drivetrain create() {

        return new Drivetrain();

    }
    

}

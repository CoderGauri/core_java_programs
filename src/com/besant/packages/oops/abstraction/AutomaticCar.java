package com.besant.packages.oops.abstraction;

public class AutomaticCar implements Car {
    private String CarType = "Automatic Car";

    @Override
    public void turnOnCar() {
        System.out.println("Turn on the Automatic car ");

    }

    @Override
    public void turnOffCar() {
        System.out.println("Turn off the Automatic car ");

    }

    @Override
    public String getCarType() {

        return this.CarType;
    }

}

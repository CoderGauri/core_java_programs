package com.besant.packages.oops.abstraction;

public class ManualCar implements Car {
    private String CarType = "Manual";

    @Override
    public void turnOnCar() {
        System.out.println("Turn on the manual car ");

    }

    @Override
    public void turnOffCar() {
        System.out.println("Turn off the manual car ");

    }

    @Override
    public String getCarType() {

        return this.CarType;
    }

}

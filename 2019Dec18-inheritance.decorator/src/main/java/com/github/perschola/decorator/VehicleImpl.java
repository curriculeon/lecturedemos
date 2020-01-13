package com.github.perschola.decorator;

/**
 * Created by leon on 12/18/2019.
 */
public class VehicleImpl implements VehicleInterface {
    String make;
    String model;
    Integer year;
    Integer numberOfWheels;

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Integer getYear() {
        return year;
    }

    @Override
    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String makeNoise() {
        return "vroom";
    }
}

package com.github.perschola.decorator;

/**
 * Created by leon on 12/18/2019.
 */
public class CoorvetteImpl implements VehicleInterface {
    VehicleInterface vehicleImpl = new VehicleImpl();

    @Override
    public String getMake() {
        return vehicleImpl.getMake();
    }

    @Override
    public String getModel() {
        return vehicleImpl.getModel();
    }

    @Override
    public Integer getYear() {
        return vehicleImpl.getYear();
    }

    @Override
    public Integer getNumberOfWheels() {
        return vehicleImpl.getNumberOfWheels();
    }

    @Override
    public String makeNoise() {
        return "VROOOOOMMMMMMMMMM!!!";
    }
}

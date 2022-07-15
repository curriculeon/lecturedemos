package com.github.perschola.decorator;

/**
 * Created by leon on 12/18/2019.
 */
abstract public class Vehicle implements VehicleInterface {
    private final VehicleInterface vehicleInterface;

    public Vehicle(VehicleInterface vehicleInterface) {
        this.vehicleInterface = vehicleInterface;
    }

    public Vehicle() {
        this(new VehicleImpl());
    }

    @Override
    public String getMake() {
        return this.vehicleInterface.getMake();
    }

    @Override
    public String getModel() {
        return this.vehicleInterface.getModel();
    }

    @Override
    public Integer getYear() {
        return this.vehicleInterface.getYear();
    }

    @Override
    public Integer getNumberOfWheels() {
        return this.vehicleInterface.getNumberOfWheels();
    }

    @Override
    public String makeNoise(){
        return this.vehicleInterface.makeNoise();
    }
}

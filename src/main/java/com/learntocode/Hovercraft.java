package com.learntocode;

public class Hovercraft extends Vehicle {
    public Hovercraft(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airHoverPressure) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airHoverPressure = airHoverPressure;
    }

    private int airHoverPressure;

    public int getAirHoverPressure() {
        return airHoverPressure;
    }

    public void setAirHoverPressure(int airHoverPressure) {
        this.airHoverPressure = airHoverPressure;
    }
    public void hover(){

    }
}

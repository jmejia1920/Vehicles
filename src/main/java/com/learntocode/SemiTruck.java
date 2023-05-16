package com.learntocode;

public class SemiTruck extends Vehicle {
    public SemiTruck(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberofTrailers) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberofTrailers = numberofTrailers;
    }

    private int numberofTrailers;

    public int getNumberofTrailers() {
        return numberofTrailers;
    }

    public void setNumberofTrailers(int numberofTrailers) {
        this.numberofTrailers = numberofTrailers;
    }
    public void loadCargo(){

    }
    public void unloadCargo(){

    }
}

package com.learntocode;

public class MainVehicle {
    public static void main(String[] args) {
        Moped moped1 = new Moped();
        moped1.setColor("blue");
        moped1.setFuelCapacity(5);

        Car car1 = new Car();
        car1.setColor("red");
        car1.setNumberOfDoors(4);

        SemiTruck semiTruck1 = new SemiTruck();
        semiTruck1.setColor("green");
        semiTruck1.setNumberofTrailers(1);

        Hovercraft hoverCraft1 = new Hovercraft();
        hoverCraft1.setColor("grey");
        hoverCraft1.setAirHoverPressure(150);

    }
}

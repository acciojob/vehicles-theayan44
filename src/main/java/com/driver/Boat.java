package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat() {
    }

    public String getVehicleName(){
        return name;
    }

    public int getVehicleCapacity(){
        return capacity;
    }
}

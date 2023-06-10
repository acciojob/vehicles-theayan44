package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat() {
        name = "";
        capacity = 0;
    }

    public String getVehicleName(){
        return name;
    }

    public int getVehicleCapacity(){
        return capacity;
    }
}

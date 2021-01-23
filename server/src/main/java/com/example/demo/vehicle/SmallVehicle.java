package com.example.demo.vehicle;

public class SmallVehicle extends Vehicle {

    public final static int price=25;

    public SmallVehicle(String regNumber,String make,String model,FuelTypeEnum fuelType) {
        super(regNumber,make,model,fuelType);
    }
}
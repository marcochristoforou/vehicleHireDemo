package com.example.demo.vehicle;

public class VanVehicle extends Vehicle {

    public final static int price=50;

    public VanVehicle(String regNumber,String make,String model,FuelTypeEnum fuelType) {
        super(regNumber,make,model,fuelType);
    }
}
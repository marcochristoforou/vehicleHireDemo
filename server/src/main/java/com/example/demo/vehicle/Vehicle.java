package com.example.demo.vehicle;

import com.example.demo.HireDetails;

public abstract class Vehicle {
    protected String _regNumber;
    protected String _make;
    protected String _model;
    protected FuelTypeEnum _fuelType;
    protected HireDetails _hireDetails;

    public Vehicle(String regNumber,
                   String make,
                   String model,
                   FuelTypeEnum fuelType) {
        _regNumber=regNumber;
        _make=make;
        _model=model;
        _fuelType=fuelType;
    }

    public String getRegNumber(){return _regNumber;}
    public String getMake(){return _make;}
    public String getModel(){return _model;}
    public FuelTypeEnum getFuelType(){return _fuelType;}

    public HireDetails getHireDetails(){return _hireDetails;}
    public void setHireDetails(HireDetails hd){_hireDetails=hd;}
}
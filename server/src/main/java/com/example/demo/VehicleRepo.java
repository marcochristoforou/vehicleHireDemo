package com.example.demo;

import com.example.demo.vehicle.*;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.time.LocalDate;

@Service
public class VehicleRepo implements IRepo<Vehicle> {
    private ArrayList<Vehicle> vehicles;


    public VehicleRepo() {
        vehicles = new ArrayList<Vehicle>();
        Vehicle v = new SmallVehicle("J271MRO","Honda","CRX",FuelTypeEnum.PETROL);
        HireDetails hd = new HireDetails("Peter", LocalDate.now().plusDays(2));
        v.setHireDetails(hd);
        vehicles.add(v);

        v = new SmallVehicle("XXX1XXX","Mazda","6",FuelTypeEnum.PETROL);
        hd = new HireDetails("Paul", LocalDate.now().plusDays(-2));
        v.setHireDetails(hd);
        vehicles.add(v);

        v = new SmallVehicle("YYY1YYY","Hyundai","i10",FuelTypeEnum.DIESEL);
        hd = new HireDetails("Mary", LocalDate.now().plusDays(2));
        v.setHireDetails(hd);
        vehicles.add(v);

        v = new EstateVehicle("ZZZ1ZZZ","BMW","320",FuelTypeEnum.DIESEL);
        hd = new HireDetails("Mungo", LocalDate.now().plusDays(-2));
        v.setHireDetails(hd);
        vehicles.add(v);

        v = new VanVehicle("AAA1AAA","Ford","Carry",FuelTypeEnum.DIESEL);
        hd = new HireDetails("Midge", LocalDate.now().plusDays(-2));
        v.setHireDetails(hd);
        vehicles.add(v);
    }

    // Get all vehicles.
    public ArrayList<Vehicle> get() {
        return vehicles;
    }

    // Get all vehicles available in given date range.
    public ArrayList<Vehicle> get(LocalDate from,LocalDate to) {
        return vehicles;
    }
}
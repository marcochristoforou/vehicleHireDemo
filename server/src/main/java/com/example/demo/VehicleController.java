package com.example.demo;

import com.example.demo.vehicle.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@CrossOrigin(origins = { "http://localhost:8090","http://localhost:8090/vehicles" })
@RestController
public class VehicleController {
    VehicleRepo _vehiclesRepo;

    @Autowired
    public VehicleController(VehicleRepo vehicleRepo) {
        _vehiclesRepo=vehicleRepo;
    }

    @GetMapping("/vehicles/available")
    public Stream<Vehicle> vehicles() {

        System.out.print("/vehicles/available");

        Stream<Vehicle> availableVehicles=_vehiclesRepo.get().stream().filter(
            x -> x.getHireDetails().isAvailable());

        System.out.print(availableVehicles.toString());

        return availableVehicles;
    }

    @GetMapping("/vehicles/hirecost/{vehicleType}/{startDate}/{endDate}")
    public long vehicles(@PathVariable(value = "vehicleType") String vehicleType,
                                    @PathVariable(value = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                    @PathVariable(value = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        System.out.print("/vehicles/hirecost/{vehicleType}"+vehicleType);
        System.out.print("/vehicles/hirecost/{fromDate}"+startDate.toString());
        System.out.print("\n");
        System.out.print("/vehicles/hirecost/{toDate}"+endDate.toString());

        long days=ChronoUnit.DAYS.between(startDate, endDate)+1;

        long price=0;
        switch (vehicleType) {
            case "SMALL":
            {
                price=SmallVehicle.price;
                break;
            }
            case "ESTATE":
            {
                price=EstateVehicle.price;
                break;
            }
            case "VAN":
            {
                price=VanVehicle.price;
                break;
            }
            default:
            {
                
            }
        }

        long totalPrice=days*price;

        return totalPrice;
    }
}
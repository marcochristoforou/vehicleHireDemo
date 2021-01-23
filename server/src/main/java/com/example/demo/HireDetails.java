package com.example.demo;

import java.time.LocalDate;

public class HireDetails {
    protected String _customer;
    protected LocalDate _hireExpiryDate;

    public HireDetails(String customer, LocalDate hireExpiryDate) {
        _customer=customer;
        _hireExpiryDate=hireExpiryDate;
    }

    public String getCustomer(){return _customer;}
    public LocalDate getHireExpiryDate(){return _hireExpiryDate;}

    public boolean isAvailable() {
//        return true;
//return LocalDate.now().isBefore(_hireExpiryDate)?true:false;
        return LocalDate.now().isAfter(_hireExpiryDate);
    }
}

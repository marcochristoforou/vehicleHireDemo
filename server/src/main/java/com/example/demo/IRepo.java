package com.example.demo;

import java.util.ArrayList;
import java.time.LocalDate;

public interface IRepo<T> {
    public ArrayList<T> get();
    public ArrayList<T> get(LocalDate from,LocalDate to);
}
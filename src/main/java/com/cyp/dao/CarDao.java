package com.cyp.dao;

import com.cyp.domain.Car;

import java.util.List;

public interface CarDao {
    int addCar(Car car);
    int removeCarById(int id);
    int updateCar(Car car);
    Car findCarById(int id);
    List<Car> list();
}

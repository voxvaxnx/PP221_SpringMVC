package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDAO {
    List<Car> listCars();
    List<Car> OrderCar(Integer order);

}

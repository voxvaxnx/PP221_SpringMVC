package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImplementation implements CarService{
    public final CarsDAO carsDAO;

    public CarServiceImplementation(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Override
    public List<Car> listCars() {
        return carsDAO.listCars();
    }

    @Override
    public List<Car> OrderCar(Integer count) {
        if (count == null || count >= 5) {
            return  carsDAO.listCars();
        } else {
            return  carsDAO.OrderCar(count);
        }
    }
}

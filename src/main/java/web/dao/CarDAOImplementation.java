package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Component
public class CarDAOImplementation implements CarsDAO {
    private List<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car("Jiguli", "Shesterka", 1985));
        listCars.add(new Car("Izh", "Kabluchek", 1976));
        listCars.add(new Car("Moskvich", "AZLK", 1969));
        listCars.add(new Car("Vaz", "Devyatka", 1996));
        listCars.add(new Car("Gaz", "Volga", 1957));
    }

    @Override
    public List<Car> listCars() {
        return listCars;
    }

    @Override
    public List<Car> OrderCar(Integer order) {
        return this.listCars.stream().limit(order).collect(Collectors.toList());
    }
}

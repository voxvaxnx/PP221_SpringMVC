package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImplementation;

import java.util.List;

@Controller
public class CarsController {
    public final CarServiceImplementation carServiceImplementation;

    public CarsController(CarServiceImplementation carServiceImplementation) {
        this.carServiceImplementation = carServiceImplementation;
    }

    @GetMapping("/cars")
    public String GetCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<Car> cars = carServiceImplementation.OrderCar(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

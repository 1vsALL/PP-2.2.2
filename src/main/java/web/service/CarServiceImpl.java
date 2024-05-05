package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 2000));
        cars.add(new Car("Mercedes", 2024));
        cars.add(new Car("Audi", 2017));
        cars.add(new Car("Toyota", 2021));
        cars.add(new Car("Tesla", 2020));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}

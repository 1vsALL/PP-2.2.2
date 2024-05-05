package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;
    private static int ID;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 2000, ++ID));
        cars.add(new Car("Mercedes", 2024, ++ID));
        cars.add(new Car("Audi", 2017, ++ID));
        cars.add(new Car("Toyota", 2021, ++ID));
        cars.add(new Car("Tesla", 2020, ++ID));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    @Autowired
    private Car car;

    public List<Car> getCar(String howMuchCar) {
        int cars = (howMuchCar == null) ? 5 : Integer.parseInt(howMuchCar);
        return car.getCarList().stream()
                                .limit(cars)
                                .collect(Collectors.toList());
    }
}

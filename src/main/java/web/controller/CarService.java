package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    @Autowired
    private Car car;

    public List<Car> getCar(int howMuchCar) {
        return car.getCarList().subList(0,(howMuchCar-1)<5?howMuchCar:5);
    }
}

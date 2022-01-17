package web.controller;

import java.util.List;

public class CarService {

    private  List<Car> carList;

    public CarService(){
        carList = new Car().getCarList();
    }
    public List<Car> getCar(int howMuchCar) {
        return carList.subList(0,(howMuchCar-1)<5?howMuchCar:5);
    }
}

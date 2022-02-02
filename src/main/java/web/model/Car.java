package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private String marka;
    private String model;
    private int horsepower;

    private List<Car> carList;

    public Car(){
        carList = new ArrayList<>();
        carList.add(new Car("BMW","X5", 625));
        carList.add(new Car("bugatti","veyron", 1001));
        carList.add(new Car("lamborghini","huracan", 610));
        carList.add(new Car("Porsche","Macan 2.0", 252));
        carList.add(new Car("Porsche","911 Carrera", 370));
    };

    public Car(String marka, String model, int horsepower) {
        this.marka = marka;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public List<Car> getCarList() {
        return carList;
    }
}

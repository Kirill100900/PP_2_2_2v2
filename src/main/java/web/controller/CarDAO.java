package web.controller;

import Car.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car(1,"Audi", 6));
        list.add(new Car(2,"BMW", 750));
        list.add(new Car(3,"Porsche", 911));
        list.add(new Car(4,"Mercedes", 63));
        list.add(new Car(5,"Tesla", 3));
    }

    public List<Car> index() {
        return list;
    }

    public List<Car> show(int id) {

        if (id == 0 || id > 5) return list;
        return list.stream().limit(id).collect(Collectors.toList());

    }
}

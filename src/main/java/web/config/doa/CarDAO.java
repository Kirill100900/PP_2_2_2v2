package web.config.doa;

import org.springframework.stereotype.Component;
import web.config.car.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO implements CarDAO1 {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car(1,"Audi", 6));
        list.add(new Car(2,"BMW", 750));
        list.add(new Car(3,"Porsche", 911));
        list.add(new Car(4,"Mercedes", 63));
        list.add(new Car(5,"Tesla", 3));
    }

    public List<Car> getList() {
        return list;
    }

}

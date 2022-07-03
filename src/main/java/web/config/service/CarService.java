package web.config.service;


import web.config.car.Car;

import java.util.List;

public interface CarService {
    void add (Car car);
    List<Car> list();
    List<Car> index();
     List<Car> show(int id);
}

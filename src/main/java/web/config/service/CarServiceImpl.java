package web.config.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.car.Car;
import web.config.doa.CarDAO;

import java.util.List;


import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
private CarDAO carDAO;


    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> list() {
        return list();
    }

    public List<Car> index() {
        return carDAO.getList();
    }

    public List<Car> show(int id) {

        if (id == 0 || id > 5) return carDAO.getList();
        return carDAO.getList().stream().limit(id).collect(Collectors.toList());

    }
}

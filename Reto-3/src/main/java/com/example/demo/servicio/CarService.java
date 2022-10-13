package com.example.demo.servicio;

import com.example.demo.modelo.Car;
import com.example.demo.repositorio.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List < Car > getAll() {
        return carRepository.getAll();
    }

    public Optional < Car > getCar(int carId) {
        return carRepository.getCar(carId);
    }

    public Car save(Car car) {
        if (car.getIdCar() == null) {
            return carRepository.save(car);
        } else {
            Optional < Car > e = carRepository.getCar(car.getIdCar());
            if (e.isEmpty()) {
                return carRepository.save(car);
            } else {
                return car;
            }
        }
    }
}

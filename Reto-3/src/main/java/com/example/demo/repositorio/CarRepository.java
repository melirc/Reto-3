package com.example.demo.repositorio;

import com.example.demo.interfase.CarInterface;
import com.example.demo.modelo.Car;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class CarRepository {
    @Autowired
    private CarInterface carCrudRepository;
    
    public List<Car> getAll(){
        return (List<Car>) carCrudRepository.findAll();
    }
     public Optional<Car> getCar(int id){
        return carCrudRepository.findById(id);
    }
     
    public Car save(Car car){
        return carCrudRepository.save(car);
    }
      
}

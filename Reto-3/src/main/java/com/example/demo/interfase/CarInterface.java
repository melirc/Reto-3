package com.example.demo.interfase;

import com.example.demo.modelo.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarInterface extends CrudRepository <Car, Integer> {
    
}

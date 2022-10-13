package com.example.demo.interfase;

import com.example.demo.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository <Reservation, Integer> {
    
}

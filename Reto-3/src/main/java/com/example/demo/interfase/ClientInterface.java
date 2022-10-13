package com.example.demo.interfase;

import com.example.demo.modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository <Client, Integer> {
    
}

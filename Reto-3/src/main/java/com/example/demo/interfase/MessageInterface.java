package com.example.demo.interfase;

import com.example.demo.modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}

package com.example.demo.repositorio;

import com.example.demo.interfase.MessageInterface;
import com.example.demo.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class MessageRepository {
    @Autowired
    private MessageInterface messageCrudRepository;
    
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
     public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }
     
    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
}

package com.example.demo.repositorio;

import com.example.demo.interfase.GamaInterface;
import com.example.demo.modelo.Gama;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class GamaRepository {
    @Autowired
    private GamaInterface gamaCrudRepository;
    
    public List<Gama> getAll(){
        return (List<Gama>) gamaCrudRepository.findAll();
    }
     public Optional<Gama> getGama(int id){
        return gamaCrudRepository.findById(id);
    }
     
    public Gama save(Gama gama){
        return gamaCrudRepository.save(gama);
    }
    
}

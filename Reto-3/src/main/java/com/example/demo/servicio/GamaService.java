package com.example.demo.servicio;

import com.example.demo.modelo.Gama;
import com.example.demo.repositorio.GamaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class GamaService {
    @Autowired
    private GamaRepository gamaRepository;
    
    public List<Gama> getAll () {
        return gamaRepository.getAll();
    }
    
    public Optional<Gama> getGama(int gamaId) {
        return gamaRepository.getGama(gamaId);
    }
    
    public Gama save(Gama gama) {
        if (gama.getIdGama() == null) {
            return gamaRepository.save(gama);
        } else {
            Optional<Gama> gama1 = gamaRepository.getGama(gama.getIdGama());
            if (gama1.isEmpty()) {
                return gamaRepository.save(gama);
            } else {
                return gama;
            }
        }
    } 
}

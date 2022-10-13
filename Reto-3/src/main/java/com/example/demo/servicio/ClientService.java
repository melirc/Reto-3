package com.example.demo.servicio;

import com.example.demo.modelo.Client;
import com.example.demo.repositorio.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List < Client > getAll() {
        return clientRepository.getAll();
    }

    public Optional < Client > getClient(int clientId) {
        return clientRepository.getClient(clientId);
    }

    public Client save(Client client) {
        if (client.getIdClient() == null) {
            return clientRepository.save(client);
        } else {
            Optional < Client > e = clientRepository.getClient(client.getIdClient());
            if (e.isEmpty()) {
                return clientRepository.save(client);
            } else {
                return client;
            }
        }
    }
}
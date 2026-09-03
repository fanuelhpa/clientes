package com.fandevv.clientes.services;

import com.fandevv.clientes.entities.Client;
import com.fandevv.clientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client findById(Long id) {
        Client client = repository.findById(id).get();
        return client;
    }
}

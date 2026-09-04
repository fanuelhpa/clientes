package com.fandevv.clientes.services;

import com.fandevv.clientes.dto.ClientDTO;
import com.fandevv.clientes.entities.Client;
import com.fandevv.clientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.ResourceAccessException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(() -> new ResourceAccessException("Recurso não encontrado"));
        return new ClientDTO(client);
    }
}

package com.fandevv.clientes.controllers;

import com.fandevv.clientes.entities.Client;
import com.fandevv.clientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public String teste() {
        return "Hello world";
    }

    @GetMapping(value = "/{id}")
    public Client findById(@PathVariable Long id) {
        return service.findById(id);
    }
}

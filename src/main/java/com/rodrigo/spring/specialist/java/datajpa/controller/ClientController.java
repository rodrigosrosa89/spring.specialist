package com.rodrigo.spring.specialist.java.datajpa.controller;

import com.rodrigo.spring.specialist.java.core.models.entity.ClientEntity;
import com.rodrigo.spring.specialist.java.core.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository repository;

    @GetMapping("/Client")
    public List<ClientEntity> buscarClientes() {
        return repository.findAll();
    }

    @GetMapping("/Client/{id}")
    public ClientEntity buscarClientePorId(@PathVariable(value = "id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/Client/criar")
    public ClientEntity criarCliente(ClientEntity clientEntity) {
        return repository.save(clientEntity);
    }

    @PutMapping("/Client/atualizar")
    public ClientEntity atualizarCliente(ClientEntity clientEntity) {
        return repository.save(clientEntity);
    }
}

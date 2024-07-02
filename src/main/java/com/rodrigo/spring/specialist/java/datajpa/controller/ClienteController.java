package com.rodrigo.spring.specialist.java.datajpa.controller;

import com.rodrigo.spring.specialist.java.datajpa.model.Cliente;
import com.rodrigo.spring.specialist.java.datajpa.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteRepository repository;

    @GetMapping("/cliente")
    public List<Cliente> buscarClientes() {
        return repository.findAll();
    }

    @GetMapping
    public Cliente buscarClientePorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @PutMapping
    public Cliente atualizarCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}

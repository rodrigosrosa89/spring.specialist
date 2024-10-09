package com.rodrigo.spring.specialist.java.datajpa.controller;

import com.rodrigo.spring.specialist.java.datajpa.dtos.Cliente;
import com.rodrigo.spring.specialist.java.datajpa.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteRepository repository;

    @GetMapping("/cliente")
    public List<Cliente> buscarClientes() {
        return repository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente buscarClientePorId(@PathVariable(value = "id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/cliente/criar")
    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @PutMapping("/cliente/atualizar")
    public Cliente atualizarCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}

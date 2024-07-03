package com.rodrigo.spring.specialist.java.datajpa.repositories;


import com.rodrigo.spring.specialist.java.datajpa.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}

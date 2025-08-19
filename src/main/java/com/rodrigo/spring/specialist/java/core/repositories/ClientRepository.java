package com.rodrigo.spring.specialist.java.core.repositories;


import com.rodrigo.spring.specialist.java.core.models.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    
}

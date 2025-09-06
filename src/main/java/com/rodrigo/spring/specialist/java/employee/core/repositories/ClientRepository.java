package com.rodrigo.spring.specialist.java.employee.core.repositories;


import com.rodrigo.spring.specialist.java.employee.core.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    
}

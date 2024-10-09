package com.rodrigo.spring.specialist.java.datajpa.repository;

import com.rodrigo.spring.specialist.java.datajpa.dtos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

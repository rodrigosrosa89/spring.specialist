package com.rodrigo.spring.specialist.java.core.repositories;

import com.rodrigo.spring.specialist.java.core.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

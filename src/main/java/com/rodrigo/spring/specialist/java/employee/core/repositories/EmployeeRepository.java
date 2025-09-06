package com.rodrigo.spring.specialist.java.employee.core.repositories;

import com.rodrigo.spring.specialist.java.employee.core.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

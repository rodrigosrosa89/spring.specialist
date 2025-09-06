package com.rodrigo.spring.specialist.java.employee.core.repositories;

import com.rodrigo.spring.specialist.java.employee.core.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}

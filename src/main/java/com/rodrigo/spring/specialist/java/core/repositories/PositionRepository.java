package com.rodrigo.spring.specialist.java.core.repositories;

import com.rodrigo.spring.specialist.java.core.models.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}

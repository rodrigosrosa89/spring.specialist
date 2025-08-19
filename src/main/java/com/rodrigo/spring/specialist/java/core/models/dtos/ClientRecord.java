package com.rodrigo.spring.specialist.java.core.models.dtos;

public record ClientRecord(
        Long id,
        String name,
        String email,
        String phone
) {
}

package com.rodrigo.spring.specialist.java.product.model;

import java.math.BigDecimal;

public record ProductDTO(
        String id,
        String name,
        String description,
        BigDecimal price
) {}

package com.lpamplonadev.ordermanagement.dto.product;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record ProductResponse(
    UUID id,
    String name,
    BigDecimal price,
    boolean active,
    Instant createdAt,
    Instant updatedAt) {

}
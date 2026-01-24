package com.lpamplonadev.ordermanagement.dto.order;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import com.lpamplonadev.ordermanagement.model.OrderStatus;

public record OrderResponse(
    UUID id,
    UUID userId,
    OrderStatus status,
    BigDecimal total,
    List<OrderItemResponse> items,
    Instant createdAt,
    Instant updatedAt) {

}

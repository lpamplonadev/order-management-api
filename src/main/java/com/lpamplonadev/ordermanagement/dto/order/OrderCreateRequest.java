package com.lpamplonadev.ordermanagement.dto.order;

import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record OrderCreateRequest(
    @NotNull(message = "User ID is required") UUID userId,

    @NotEmpty(message = "Order must contain at least one item") List<OrderItemCreateRequest> items) {

}

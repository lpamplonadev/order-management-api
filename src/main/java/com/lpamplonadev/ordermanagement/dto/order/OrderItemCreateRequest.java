package com.lpamplonadev.ordermanagement.dto.order;

import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderItemCreateRequest(
    @NotNull(message = "Product ID is required") UUID productId,

    @Min(value = 1, message = "Quantity must be at least 1") int quantity) {

}

package com.lpamplonadev.ordermanagement.dto.order;

import com.lpamplonadev.ordermanagement.model.OrderStatus;

import jakarta.validation.constraints.NotNull;

public record UpdateOrderStatusRequest(
    @NotNull(message = "Status is required") OrderStatus status) {

}

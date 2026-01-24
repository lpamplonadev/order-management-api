package com.lpamplonadev.ordermanagement.dto.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;

public record ProductCreateRequest(
    @NotBlank(message = "Product name is required") @Size(max = 160, message = "Product name must not exceed 160 characters") String name,
  
    @NotNull(message = "Product price is required") @DecimalMin(value = "0.01", message = "Product price must be at least 0") BigDecimal price) {

}

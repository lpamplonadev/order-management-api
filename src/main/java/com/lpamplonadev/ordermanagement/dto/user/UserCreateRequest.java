package com.lpamplonadev.ordermanagement.dto.user;

import jakarta.validation.constraints.*;

public record UserCreateRequest(
    @NotBlank(message = "Name is required") @Size(max = 120, message = "Name must not exceed 120 characters") String name,

    @NotBlank(message = "Email is required") @Email(message = "Email should be valid") @Size(max = 160, message = "Email must not exceed 160 characters") String email

) {
}

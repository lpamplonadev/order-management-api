package com.lpamplonadev.ordermanagement.mapper;

import org.springframework.stereotype.Component;

import com.lpamplonadev.ordermanagement.dto.product.ProductResponse;
import com.lpamplonadev.ordermanagement.model.Product;

@Component
public class ProductMapper {
  public ProductResponse toResponse(Product product){
    return new ProductResponse(
        product.getId(),
        product.getName(),
        product.getPrice(),
        product.isActive(),
        product.getCreatedAt(),
        product.getUpdatedAt()
    );
  }
}

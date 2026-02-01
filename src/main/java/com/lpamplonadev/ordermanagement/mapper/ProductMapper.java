package com.lpamplonadev.ordermanagement.mapper;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.lpamplonadev.ordermanagement.dto.product.ProductCreateRequest;
import com.lpamplonadev.ordermanagement.dto.product.ProductResponse;
import com.lpamplonadev.ordermanagement.model.Product;

@Component
public final class ProductMapper {
  public Product toEntity(ProductCreateRequest request) {
    Objects.requireNonNull(request, "Request must not be null");

    return Product.builder()
      .name(request.name())
      .price(request.price())
      .build();
  }

  public ProductResponse toResponse(Product product){
    Objects.requireNonNull(product, "Request must not be null");
    
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

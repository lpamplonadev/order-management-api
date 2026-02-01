package com.lpamplonadev.ordermanagement.service;

import com.lpamplonadev.ordermanagement.dto.product.ProductCreateRequest;
import com.lpamplonadev.ordermanagement.dto.product.ProductResponse;
import com.lpamplonadev.ordermanagement.mapper.ProductMapper;
import com.lpamplonadev.ordermanagement.model.Product;
import com.lpamplonadev.ordermanagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductResponse create(ProductCreateRequest request) {
    Product product = productMapper.toEntity(request);
    Product saved = productRepository.save(product);
    return productMapper.toResponse(saved);
  }

  @Transactional(readOnly = true)
  public Page<ProductResponse> findAll(Pageable pageable) {
    return productRepository.findAll(pageable)
      .map(productMapper::toResponse);
  }
  
  @Transactional(readOnly = true)
  public ProductResponse findById(UUID id) {
    Product product = productRepository.findById(id)
      .orElseThrow(() -> new RuntimeException("Product not found"));  

    return productMapper.toResponse(product);
  }
}

package com.lpamplonadev.ordermanagement.repository;

import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lpamplonadev.ordermanagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, UUID>{
  Page<Order> findByUserId(UUID userId, Pageable pageable);
}

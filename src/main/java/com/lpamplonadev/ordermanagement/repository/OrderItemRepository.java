package com.lpamplonadev.ordermanagement.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpamplonadev.ordermanagement.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {

}

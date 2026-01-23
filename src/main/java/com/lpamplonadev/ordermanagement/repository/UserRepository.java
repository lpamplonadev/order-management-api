package com.lpamplonadev.ordermanagement.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpamplonadev.ordermanagement.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
  boolean existsByEmail(String email);
}

package com.example.cqrsexample.repository;

import com.example.cqrsexample.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

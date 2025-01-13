package com.example.cqrsexample.handler;

import com.example.cqrsexample.query.GetOrderByIdQuery;
import com.example.cqrsexample.entity.Order;
import com.example.cqrsexample.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderQueryHandler {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderQueryHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order handleGetOrderById(GetOrderByIdQuery query) {
        return orderRepository.findById(query.getOrderId()).orElse(null);
    }
}

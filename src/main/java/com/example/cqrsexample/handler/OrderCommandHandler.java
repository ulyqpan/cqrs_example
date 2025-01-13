package com.example.cqrsexample.handler;

import com.example.cqrsexample.command.CreateOrderCommand;
import com.example.cqrsexample.entity.Order;
import com.example.cqrsexample.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCommandHandler {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderCommandHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order handleCreateOrder(CreateOrderCommand command) {
        Order order = new Order();
        order.setItems(command.getItems());
        order.setTotalPrice(command.getTotalPrice());
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }
}

package com.example.cqrsexample.controller;

import com.example.cqrsexample.dto.CreateOrderDto;
import com.example.cqrsexample.dto.OrderDto;
import com.example.cqrsexample.command.CreateOrderCommand;
import com.example.cqrsexample.query.GetOrderByIdQuery;
import com.example.cqrsexample.handler.OrderCommandHandler;
import com.example.cqrsexample.handler.OrderQueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderCommandHandler commandHandler;
    private final OrderQueryHandler queryHandler;

    @Autowired
    public OrderController(OrderCommandHandler commandHandler, OrderQueryHandler queryHandler) {
        this.commandHandler = commandHandler;
        this.queryHandler = queryHandler;
    }

    @PostMapping
    public OrderDto createOrder(@RequestBody CreateOrderDto createOrderDto) {
        CreateOrderCommand command = new CreateOrderCommand(createOrderDto.getItems(), createOrderDto.getTotalPrice());
        return new OrderDto(commandHandler.handleCreateOrder(command));
    }

    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable Long id) {
        GetOrderByIdQuery query = new GetOrderByIdQuery(id);
        return new OrderDto(queryHandler.handleGetOrderById(query));
    }
}

package com.example.cqrsexample.query;

public class GetOrderByIdQuery {

    private Long orderId;

    public GetOrderByIdQuery(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}

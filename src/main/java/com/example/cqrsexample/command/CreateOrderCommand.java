package com.example.cqrsexample.command;

import java.util.List;

public class CreateOrderCommand {
    private List<String> items;
    private double totalPrice;

    public CreateOrderCommand(List<String> items, double totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

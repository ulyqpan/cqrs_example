package com.example.cqrsexample.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateOrderDto {

    @NotNull
    private List<String> items;

    @NotNull
    private double totalPrice;

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

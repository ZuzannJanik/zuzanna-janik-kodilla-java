package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderDto {
    private Order order;
    private boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }
}
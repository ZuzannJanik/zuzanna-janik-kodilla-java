package com.kodilla.good.patterns.challenges.Allegro;

import com.kodilla.good.patterns.challenges.ProductOrderService.Order;

public class OrderFoodDto {
    private OrderFood orderFood;
    private boolean isOrdered;

    public OrderFoodDto(OrderFood orderFood, boolean isOrdered) {
        this.orderFood = orderFood;
        this.isOrdered = isOrdered;
    }
}

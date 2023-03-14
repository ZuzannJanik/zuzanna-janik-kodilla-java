package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderServiceProcessor implements OrderService{
    public boolean createOrder(Order order) {
        System.out.println("Order is created");

        return true;
    }
}

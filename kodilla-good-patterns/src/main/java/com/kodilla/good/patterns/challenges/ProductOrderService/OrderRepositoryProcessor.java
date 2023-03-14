package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRepositoryProcessor implements OrderRepository{
    @Override
    public void sendOrder(Order order) {
        System.out.println("Collect and send to user: " + order.getUser() + " on adress: " + order.getOrderAdress() + ". " + order.getItemQty() + " his product: " + order.getItem() + " of this item.");
    }
}

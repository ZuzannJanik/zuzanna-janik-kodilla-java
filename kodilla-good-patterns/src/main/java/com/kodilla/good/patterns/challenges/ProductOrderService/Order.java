package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Order {
    private String user;
    private String item;
    private int itemQty;
    private String orderAdress;

    public Order(final String user, final String item, final int itemQty, final String orderAdress) {
        this.user = user;
        this.item = item;
        this.itemQty = itemQty;
        this.orderAdress = orderAdress;
    }

    public String getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public int getItemQty() {
        return itemQty;
    }

    public String getOrderAdress() {
        return orderAdress;
    }
}



package com.kodilla.good.patterns.challenges.Allegro;

public class Warehouse {
    Delivery delivery = new Delivery();

    public void checkWarehouse() {
        System.out.println(delivery.getWarehouse());
    }
}

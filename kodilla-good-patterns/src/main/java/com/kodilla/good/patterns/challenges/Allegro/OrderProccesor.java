package com.kodilla.good.patterns.challenges.Allegro;

public class OrderProccesor {
    private InformationService informationService;

    private Delivery delivery;
    private Warehouse warehouse;

    public OrderProccesor(InformationService informationService, Delivery delivery, Warehouse warehouse) {
        this.informationService = informationService;
        this.delivery = delivery;
        this.warehouse = warehouse;
    }
}


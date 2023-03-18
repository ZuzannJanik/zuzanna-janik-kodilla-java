package com.kodilla.good.patterns.challenges.Allegro;

import com.kodilla.good.patterns.challenges.Food2Door.HealthyShop;

public class AllegroApp {
    public static void main(String[] args) {
        InformationService informationService = new InformationService();
        Delivery delivery = new Delivery();
        Warehouse warehouse = new Warehouse();

        OrderProccesor orderProccesor = new OrderProccesor(informationService, delivery, warehouse);


    }
}

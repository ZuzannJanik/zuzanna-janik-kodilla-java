package com.kodilla.good.patterns.challenges.Allegro;

public class AllegroApp {
    public static void main(String[] args) {
        InformationService informationService = new InformationService();
        Delivery delivery = new Delivery();

        delivery.delivery();

        OrderProccesor orderProccesor = new OrderProccesor(informationService, delivery);
        orderProccesor.process("ExtraFoodShop",  "extrafoodshop@email.com", "NewYork", 1,"ExtraBananas", 2000);
    }
}

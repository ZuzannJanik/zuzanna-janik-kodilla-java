package com.kodilla.good.patterns.challenges.Allegro;

public class OrderProccesor {
    private InformationService informationService;
    private Delivery delivery;
    private Company company;

    public OrderProccesor(InformationService informationService, Delivery delivery) {
        this.informationService = informationService;
        this.delivery = delivery;
    }

    public OrderFoodDto process(String companyName, String companyMail, String companyAdress, int productId, String productName, int productQty) {
        OrderFood orderFood = new OrderFood(companyName, companyMail, companyAdress, productId, productName, productQty);
        boolean isOrderConfirmed = company.process(productName, productQty);

        if (isOrderConfirmed) {
            informationService.deliveryEmail();
            informationService.checkWarehouseEmail(productId, productName, productQty);
            informationService.orderProcessing();
            company.process(productName, productQty);
            return new OrderFoodDto(orderFood, true);
        } else {
            return new OrderFoodDto(orderFood, false);
        }
    }
}


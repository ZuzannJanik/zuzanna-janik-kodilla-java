package com.kodilla.good.patterns.challenges.Allegro;

public class InformationService extends Information {

    public void deliveryEmail () {
        super.deliveryEmail();
        System.out.println("***Sending email***");
    }

    @Override
    public void checkWarehouseEmail(int productId, String productName, int productQty) {
        super.checkWarehouseEmail(productId, productName, productQty);
       // System.out.println(delivery.getWarehouse());
    }

    public void orderProcessing() {
        System.out.println("Order is created");
    }
}

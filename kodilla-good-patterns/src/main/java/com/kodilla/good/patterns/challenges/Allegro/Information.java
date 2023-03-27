package com.kodilla.good.patterns.challenges.Allegro;

public abstract class Information {

    public void deliveryEmail () {
        System.out.println("Your inventory has been updated");
    }

    public void checkWarehouseEmail (Product product) {
        System.out.println("We currently have the following products in stock at Food2Door");
    }
    public void orderProcessing (Company company, Product product) {
        System.out.println("Order is created");
    }

    protected void checkWarehouseEmail(int productId, String productName, int productQty) {
    }
}

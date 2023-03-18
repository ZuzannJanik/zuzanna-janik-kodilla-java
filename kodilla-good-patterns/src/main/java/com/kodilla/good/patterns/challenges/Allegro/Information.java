package com.kodilla.good.patterns.challenges.Allegro;

public abstract class Information {

    public void deliveryEmail (Company company) {
        System.out.println("Your inventory has been updated");
    }

    public void checkWarehouseEmail (Product product) {
        System.out.println("We currently have the following products in stock at Food2Door");
    }
}

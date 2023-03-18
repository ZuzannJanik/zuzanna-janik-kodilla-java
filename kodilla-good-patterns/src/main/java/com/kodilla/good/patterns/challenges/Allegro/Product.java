package com.kodilla.good.patterns.challenges.Allegro;

public class Product {
    private int productId;
    private String productName;
    private int productQty;

    public Product(int productId, String productName, int productQty) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }
}

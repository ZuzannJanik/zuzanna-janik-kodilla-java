package com.kodilla.good.patterns.challenges.Allegro;

public class OrderFood {
    private String companyName;
    private String companyMail;
    private String companyAdress;
    private int productId;
    private String productName;
    private int productQty;

    public OrderFood(String companyName, String companyMail, String companyAdress, int productId, String productName, int productQty) {
        this.companyName = companyName;
        this.companyMail = companyMail;
        this.companyAdress = companyAdress;
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQty() {
        return productQty;
    }
}
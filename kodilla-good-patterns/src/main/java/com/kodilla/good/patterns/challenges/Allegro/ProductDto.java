package com.kodilla.good.patterns.challenges.Allegro;

public class ProductDto {
    private Product product;
    private boolean productExist;

    public ProductDto(Product product, boolean productExist) {
        this.product = product;
        this.productExist = productExist;
    }
}

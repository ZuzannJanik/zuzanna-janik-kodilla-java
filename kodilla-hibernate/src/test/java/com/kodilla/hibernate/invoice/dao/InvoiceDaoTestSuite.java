package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    void testInvoiceDaoSave() {
        //Given
        Product banana = new Product("Banana");
        Product apple = new Product("Apple");
        Product watermelon = new Product("Watermelon");

        Item bananas = new Item(banana, new BigDecimal(10), 100, new BigDecimal(1000));
        Item apples = new Item(apple, new BigDecimal(5), 1000, new BigDecimal(5000));
        Item watermelons = new Item(watermelon, new BigDecimal(20), 10, new BigDecimal(200));

        bananas.setProduct(banana);
        apples.setProduct(apple);
        watermelons.setProduct(watermelon);

        Invoice invoice = new Invoice("01/2023");
        invoice.getItems().add(bananas);
        invoice.getItems().add(apples);
        invoice.getItems().add(watermelons);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //Clean
        invoiceDao.deleteById(invoiceId);
    }
}


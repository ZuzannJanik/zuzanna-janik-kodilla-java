package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("1000  islands")
                .ingredient("Lettuce")
                .ingredient("Cucumber")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);

        //When
        String bunChoice = bigmac.getBun();
        int burgersQty = bigmac.getBurgers();
        String sauceChoice = bigmac.getSauce();
        int ingredientsQty = bigmac.getIngredients().size();

        //Then
        assertEquals("Sesame", bunChoice);
        assertEquals(2, burgersQty);
        assertEquals("1000  islands", sauceChoice);
        assertEquals(3, ingredientsQty);
    }
}

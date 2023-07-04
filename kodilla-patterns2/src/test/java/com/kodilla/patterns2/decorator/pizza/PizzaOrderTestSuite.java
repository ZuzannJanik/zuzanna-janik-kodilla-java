package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getIngredients();
        // Then
        assertEquals("Your order: ", description);
    }
    @Test
    public void testThreePizzaOrderCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new PepperoniPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new QuatrroFormaggiPizzaOrderDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(70), calculatedCost);
    }
    @Test
    public void testThreePizzaOrderGetIngredients() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new PepperoniPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new QuatrroFormaggiPizzaOrderDecorator(pizzaOrder);

        // When
        String description = pizzaOrder.getIngredients();
        // Then
        assertEquals("Your order: Pizza with: ham, mozzarella cheese, pineapple and tomato sauce. Pizza with: hot pepperoni, mozzarella cheese and tomato sauce. Pizza with: tomato sauce, mozzarella, gorgonzola, Parmigiano Reggiano, and goat cheese. ", description);
    }

}

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class QuatrroFormaggiPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public QuatrroFormaggiPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(25));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + "Pizza with: tomato sauce, mozzarella, gorgonzola, Parmigiano Reggiano, and goat cheese. ";
    }
}

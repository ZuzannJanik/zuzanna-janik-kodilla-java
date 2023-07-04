package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public PepperoniPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + "Pizza with: hot pepperoni, mozzarella cheese and tomato sauce. ";
    }
}

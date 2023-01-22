package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private double a;
    private double field;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        return field = a*a;
    }
}

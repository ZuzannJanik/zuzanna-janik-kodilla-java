package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    String name = "Circle";
    private double r;
    private double field;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 && Double.compare(circle.field, field) == 0 && Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, r, field);
    }
    public String getName() {
        return name;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        return field = Math.PI * (r*r);
    }
}

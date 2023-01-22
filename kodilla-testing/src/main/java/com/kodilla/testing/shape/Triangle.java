package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double a;
    private double h;
    private double field;

    public Triangle(String name, double a, double h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field = (a*h)/2;
    }
}

package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector() {
        this.shapes = shapes;
    }
    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        shapes.remove(shape);
        return false;
    }
    public Shape getFigure(int n) {
        if (n < shapes.size()&& n>=0) ;
        return shapes.get(n);
    }
    public void showFigures() {
        System.out.println(shapes.toString());
    }
}


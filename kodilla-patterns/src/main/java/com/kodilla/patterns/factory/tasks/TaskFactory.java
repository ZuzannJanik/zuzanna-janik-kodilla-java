package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;

public class TaskFactory {
    public static final String DRIVINGTASK = "Driving task";
    public static final String PAINTINGTASK = "Painting task";
    public static final String SHOPPINGTASK = "Shopping task";

    public final Task createTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVINGTASK -> new DrivingTask("Fun Trip", "Las Vegas", "Airplane");
            case PAINTINGTASK -> new PaintingTask("Master Piece", "Absolut Black", "Sunshine");
            case SHOPPINGTASK -> new ShoppingTask("Stimulant", "Coffee", 4.0);
            default -> null;
        };
    }
}
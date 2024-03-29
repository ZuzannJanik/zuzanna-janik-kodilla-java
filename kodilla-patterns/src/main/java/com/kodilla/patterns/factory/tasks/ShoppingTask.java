package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public void executeTask() {
        isDone = true;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isDone) {
            return true;
        } else {
            return false;
        }
    }
}

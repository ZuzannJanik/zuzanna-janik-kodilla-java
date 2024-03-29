package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isDone;
    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

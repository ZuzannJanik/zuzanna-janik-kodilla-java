package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);

        //When
        boolean taskUndone = drivingTask.isTaskExecuted();
        String name = drivingTask.getTaskName();
        drivingTask.executeTask();
        boolean taskDone = drivingTask.isTaskExecuted();

        //Then
        assertFalse(taskUndone);
        assertEquals("Fun Trip", name);
        assertTrue(taskDone);
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);

        //When
        boolean taskUndone = paintingTask.isTaskExecuted();
        String name = paintingTask.getTaskName();
        paintingTask.executeTask();
        boolean taskDone = paintingTask.isTaskExecuted();

        //Then
        assertFalse(taskUndone);
        assertEquals("Master Piece", name);
        assertTrue(taskDone);
    }
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task factoryShoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);

        //When
        boolean taskUndone = factoryShoppingTask.isTaskExecuted();
        String name = factoryShoppingTask.getTaskName();
        factoryShoppingTask.executeTask();
        boolean taskDone = factoryShoppingTask.isTaskExecuted();

        //Then
        assertFalse(taskUndone);
        assertEquals("Stimulant", name);
        assertTrue(taskDone);
    }
}

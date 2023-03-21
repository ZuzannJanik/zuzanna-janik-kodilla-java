package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    Board board;
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(com.kodilla.spring.portfolio.BoardConfig.class);

        //When
        board.getToDoList().addTask("Save the planet");
        board.getInProgressList().addTask("Run tests");
        board.getDoneList().addTask("Run tests");

        //Then
        Assertions.assertTrue(board.getToDoList().tasks.contains("Save the planet"));
        Assertions.assertTrue(board.getInProgressList().tasks.contains("Run tests"));
        Assertions.assertTrue(board.getDoneList().tasks.contains("Run tests"));
    }
}

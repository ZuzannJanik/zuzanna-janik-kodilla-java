package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testHomeworkUpdate() {
        // Given
        HomeworkFiles grzegorz = new GrzegorzBrzeczyszczykiewiczHomeworkFiles();
        Mentor marianKociniak = new Mentor("Marian Kociniak");
        grzegorz.registerObserverHomework(marianKociniak);

        //When
        grzegorz.addHomeworkFile("Module 24.4 Task");

        //Then
        assertEquals(1, marianKociniak.getUpdateHomeworks());
    }
}

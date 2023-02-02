package com.kodilla.exception.io;


import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void testNotThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1.0));
    }
    @Test
    void testThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then

        assertThrows(ExceptionHandling.class,() -> secondChallenge.probablyIWillThrowException(2.0,1.5));
    }
}

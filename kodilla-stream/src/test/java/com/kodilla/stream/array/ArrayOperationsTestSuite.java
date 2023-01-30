package com.kodilla.stream.array;

import org.junit.jupiter.api.*;


public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int numbers [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(9.5,average, 0.0001 );


    }
}

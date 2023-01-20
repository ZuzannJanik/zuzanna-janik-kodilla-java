package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import org.testng.Assert;
import java.util.*;


public class CollectionTestSuite {
    private static OddNumbersExterminator oddNumbersExterminator;
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
        System.out.println();
}
    @AfterEach
    public void after() {
        System.out.println();
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName ("This test checks whether the list of even numbers is empty")

    @Test
public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(emptyNumbers);
            System.out.println("The list of even numbers is empty");
            System.out.println("Test - ok");
        //Then
        Assert.assertEquals(emptyNumbers, evenNumbers);
        }

    @DisplayName ("This test checking if the class behaves correctly when the list contains even and odd numbers")

    @Test
public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers.add(31);
        numbers.add(40);
        numbers.add(1);
        numbers.add(108);
        numbers.add(43);

        List<Integer> expectedResultsList = new ArrayList<>();
        expectedResultsList.add(40);
        expectedResultsList.add(108);

        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("class behaves correctly when the list contains even and odd numbers");
        System.out.println("Test - ok");

        //Then
        Assert.assertEquals(expectedResultsList, evenNumbers);
    }
}

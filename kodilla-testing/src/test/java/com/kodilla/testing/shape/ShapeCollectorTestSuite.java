package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;

import org.junit.jupiter.api.*;

import java.util.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void BeforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test#" + testCounter);
    }
    @Nested
    @DisplayName("Tests for circles")
    class TestCircles {

        @DisplayName("Test 1: Verifies that the number of shapes is 1 after adding a new shape.")
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4);

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 2: Verifies that the number of shapes is 0 after removing a shape.")
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertFalse(result);
            Assertions.assertEquals(0, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 3: Checking if shape retrieved from ShapeCollector class is the same as shape that was inserted into the class.")
        @Test
        public void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4);
            shapeCollector.addFigure(shape);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, result);
        }
        @DisplayName("Test 4: Verifies that returns the names of all figures as one String")
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4);
            shapeCollector.addFigure(shape);
            List<Shape> controlList = new ArrayList<>();
            controlList.add(shape);
            //When
            List<Shape> shapes = shapeCollector.getShapes();
            //Then
            Assertions.assertEquals(controlList.toString(), shapes.toString());
        }

    @Nested
    @DisplayName("Tests for squares")
    class TestSquares {
        @DisplayName("Test 1: Verifies that the number of shapes is 1 after adding a new shape.")
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square", 6);

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 2: Verifies that the number of shapes is 0 after removing a shape.")
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertFalse(result);
            Assertions.assertEquals(0, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 3: Checking if shape retrieved from ShapeCollector class is the same as shape that was inserted into the class.")
        @Test
        public void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square", 6);
            shapeCollector.addFigure(shape);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, result);
        }
        @DisplayName("Test 4: Verifies that returns the names of all figures as one String")
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square", 6);
            shapeCollector.addFigure(shape);
            List<Shape> controlList = new ArrayList<>();
            controlList.add(shape);
            //When
            List<Shape> shapes = shapeCollector.getShapes();
            //Then
            Assertions.assertEquals(controlList.toString(), shapes.toString());
        }
    }
    @Nested
    @DisplayName("Tests for triangles")
    class TestTriangles {
        @DisplayName("Test 1: Verifies that the number of shapes is 1 after adding a new shape.")
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle", 5, 2);

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 2: Verifies that the number of shapes is 0 after removing a shape.")
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle", 5, 2);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapes().size());
        }
        @DisplayName("Test 3: Checking if shape retrieved from ShapeCollector class is the same as shape that was inserted into the class.")
        @Test
        public void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle", 5, 2);
            shapeCollector.addFigure(shape);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, result);
        }
        @DisplayName("Test 4: Verifies that returns the names of all figures as one String")
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle", 5, 2);
            shapeCollector.addFigure(shape);
            List<Shape> controlList = new ArrayList<>();
            controlList.add(shape);
            //When
            List<Shape> shapes = shapeCollector.getShapes();
            //Then
            Assertions.assertEquals(controlList.toString(), shapes.toString());
        }
    }
    }
    }



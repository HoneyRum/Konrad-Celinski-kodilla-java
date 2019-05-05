package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;

public class ShapeTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape addedTriangle = new Triangle(2.0, 2.0, "Triangle");
        //When
        shapeCollector.addFigure(addedTriangle);
        Shape gottenFigure = shapeCollector.getFigure(0);
        int arraySize = shapeCollector.getSize();
        //Then
        Assert.assertEquals(addedTriangle, gottenFigure);
        Assert.assertEquals(1, arraySize);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangleToRemove = new Triangle(3.0, 4.0, "First Triangle");
        Shape stayTriangle = new Triangle(2.5, 3.5, "Second Triangle");
        shapeCollector.addFigure(triangleToRemove);
        shapeCollector.addFigure(stayTriangle);
        //When
        boolean remove = shapeCollector.removeFigure(triangleToRemove);
        int arraySize = shapeCollector.getSize();
        //Then
        Assert.assertEquals(1, arraySize);
        Assert.assertTrue(remove);
    }
    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1.5, 1.5, "Not in collection");
        //When
        boolean remove = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(remove);
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exampleCircle = new Circle(5, "Circle");
        Shape exampleTriangle = new Triangle(3.0, 4.0, "Triangle");
        Shape exampleSquare = new Square(6, "Square");
        shapeCollector.addFigure(exampleCircle);
        shapeCollector.addFigure(exampleTriangle);
        shapeCollector.addFigure(exampleSquare);
        //When
        Shape gottenFigure = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(exampleSquare, gottenFigure);
    }
    @Test
    public void testGetZeroFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exampleCircle = new Circle(5, "Circle");
        Shape exampleTriangle = new Triangle(3.0, 4.0, "Triangle");
        Shape exampleSquare = new Square(6, "Square");
        shapeCollector.addFigure(exampleCircle);
        shapeCollector.addFigure(exampleTriangle);
        shapeCollector.addFigure(exampleSquare);
        //When
        Shape gottenFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(exampleCircle, gottenFigure);
    }

    @Test
    public void testGetMinusFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exampleCircle = new Circle(5, "Circle");
        Shape exampleTriangle = new Triangle(3.0, 4.0, "Triangle");
        Shape exampleSquare = new Square(6, "Square");
        shapeCollector.addFigure(exampleCircle);
        shapeCollector.addFigure(exampleTriangle);
        shapeCollector.addFigure(exampleSquare);
        //When
        Shape minusFigure = shapeCollector.getFigure(-1);
        //Then
        Assert.assertNull(minusFigure);
    }
    @Test
    public void testGetPlusFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exampleCircle = new Circle(5, "Circle");
        Shape exampleTriangle = new Triangle(3.0, 4.0, "Triangle");
        Shape exampleSquare = new Square(6, "Square");
        shapeCollector.addFigure(exampleCircle);
        shapeCollector.addFigure(exampleTriangle);
        shapeCollector.addFigure(exampleSquare);
        //When
        Shape plusFigure = shapeCollector.getFigure(3);
        //Then
        Assert.assertNull(plusFigure);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exampleCircle = new Circle(5, "Circle");
        Shape exampleTriangle = new Triangle(3.0, 4.0, "Triangle");
        Shape exampleSquare = new Square(6, "Square");
        shapeCollector.addFigure(exampleCircle);
        shapeCollector.addFigure(exampleTriangle);
        shapeCollector.addFigure(exampleSquare);
        //When
        ArrayList<String> showTest = shapeCollector.showFigures();
        ArrayList<String> expectedStrings = new ArrayList<>();
        expectedStrings.add("Circle");
        expectedStrings.add("Triangle");
        expectedStrings.add("Square");
        //Then
        Assert.assertEquals(expectedStrings, showTest);
    }

}

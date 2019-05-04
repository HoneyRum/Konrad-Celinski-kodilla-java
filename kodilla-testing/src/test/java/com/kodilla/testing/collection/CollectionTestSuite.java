package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList;
        ArrayList<Integer> exampleList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        emptyList = exterminator.exterminate(exampleList);
        //When
        int result = emptyList.size();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList;
        ArrayList<Integer> exampleList = new ArrayList<>();
        for(int i=1; i<11; i++){
            exampleList.add(i);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        normalList = exterminator.exterminate(exampleList);
        //When
        ArrayList<Integer> result = normalList;
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals(2, (int) normalList.get(0));
        Assert.assertEquals(4, (int) normalList.get(1));
        Assert.assertEquals(6, (int) normalList.get(2));
        Assert.assertEquals(8, (int) normalList.get(3));
        Assert.assertEquals(10, (int) normalList.get(4));


    }


}

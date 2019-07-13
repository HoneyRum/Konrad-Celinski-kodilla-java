package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        //When
        double operations = ArrayOperations.getAverage(array);
        //Then
        Assert.assertEquals(4.0, operations, 0.01);
    }
}

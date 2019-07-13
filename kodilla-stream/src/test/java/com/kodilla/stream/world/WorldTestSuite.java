package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        //When
        BigDecimal peopleInTheWorld = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("84423977");
        Assert.assertEquals(expectedPeople, peopleInTheWorld);


    }
}

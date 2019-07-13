package com.kodilla.stream.world_v2;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country canada = new Country("1000000000000000");
        Country germany = new Country("1000000000000000");
        Country morocco = new Country("1000000000000000");
        Country nigeria = new Country("1000000000000000");
        Country unitedKingdoms = new Country("1000000000000000");
        Country unitedStates = new Country("1000000000000000");
        Continent america = new Continent();
        america.addCountry(canada);
        america.addCountry(unitedStates);
        Continent europe = new Continent();
        europe.addCountry(germany);
        europe.addCountry(unitedKingdoms);
        Continent africa = new Continent();
        africa.addCountry(morocco);
        africa.addCountry(nigeria);
        World world = new World();
        world.addContinent(america);
        world.addContinent(europe);
        world.addContinent(africa);
        //When
        BigDecimal allPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedValue = new BigDecimal("6000000000000000");
        Assert.assertEquals(expectedValue, allPeople);

    }
}

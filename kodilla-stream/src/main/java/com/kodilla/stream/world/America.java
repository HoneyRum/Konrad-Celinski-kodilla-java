package com.kodilla.stream.world;

import java.util.Arrays;
import java.util.List;

public class America implements Continent {

    List<Country> countries = Arrays.asList(new Canada(), new UnitedStates());

    public List<Country> getCountries(){
        return countries;
    }
}

package com.kodilla.stream.world;

import java.util.Arrays;
import java.util.List;

public final class Africa implements Continent {

    List<Country> countries = Arrays.asList(new Nigeria(), new Morocco());

    public List<Country> getCountries(){
        return countries;
    }
}

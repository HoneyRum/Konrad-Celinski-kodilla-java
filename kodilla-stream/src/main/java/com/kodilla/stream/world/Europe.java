package com.kodilla.stream.world;

import java.util.Arrays;
import java.util.List;

public final class Europe implements Continent {


    List<Country> countries = Arrays.asList(new Germany(), new UnitedKingdoms());

    public List<Country> getCountries(){
        return countries;
    }
}

package com.kodilla.stream.world_v2;

import java.util.List;

public final class Continent {
    private List<Country> countries;

    public void addCountry(Country country){
        countries.add(country);
    }
    public List<Country> getCountries(){
        return countries;
    }
}

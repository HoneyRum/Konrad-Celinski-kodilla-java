package com.kodilla.stream.world_v2;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private List<Continent> continents;

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream()
                .map(country -> getPeopleQuantity()))
                .reduce(peopleQuantity, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

}

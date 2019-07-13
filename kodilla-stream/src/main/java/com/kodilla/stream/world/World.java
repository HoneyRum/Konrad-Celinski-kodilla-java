package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public final class World {

    List<Continent> continents = Arrays.asList(new Europe(), new Africa(), new America());

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = BigDecimal.ZERO;
            peopleQuantity = continents.stream()
                    .flatMap(continent1 -> continent1.getCountries().stream()
                            .map(country -> country.getPeopleQuantity()))
                    .reduce(peopleQuantity, (sum, current) -> sum = sum.add(current));
            return peopleQuantity;
    }
}

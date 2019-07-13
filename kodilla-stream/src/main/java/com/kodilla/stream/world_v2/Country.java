package com.kodilla.stream.world_v2;

import java.math.BigDecimal;

public final class Country {
    private BigDecimal pop;

    public Country(String population) {
        pop = new BigDecimal(population);
    }

    public BigDecimal getPeopleQuantity(){
        return pop;
    }
}

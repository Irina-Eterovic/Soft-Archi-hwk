package com.hwk.abstract_factory.products.city;

import com.hwk.abstract_factory.products.house.ElfHouse;

import java.util.List;

public class ElfCity implements ICity {
    private List<ElfHouse> elfHouses;
    @Override
    public <T> List<T> getHouses() {
        System.out.println("Here have a beautiful tower city");
        return (List<T>) this.elfHouses;
    }
}

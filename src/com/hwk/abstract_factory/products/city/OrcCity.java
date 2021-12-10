package com.hwk.abstract_factory.products.city;

import com.hwk.abstract_factory.products.house.ElfHouse;
import com.hwk.abstract_factory.products.house.OrcHouse;

import java.util.List;

public class OrcCity implements ICity {
    private List<OrcHouse> orcHouses;
    @Override
    public <T> List<T> getHouses() {
        System.out.println("Here have a beautiful cave city");
        return (List<T>) this.orcHouses;
    }
}

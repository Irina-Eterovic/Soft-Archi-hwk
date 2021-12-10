package com.hwk.abstract_factory.factories;

import com.hwk.abstract_factory.products.character.ICharacter;
import com.hwk.abstract_factory.products.character.Orc;
import com.hwk.abstract_factory.products.city.ICity;
import com.hwk.abstract_factory.products.city.OrcCity;
import com.hwk.abstract_factory.products.house.IHouse;
import com.hwk.abstract_factory.products.house.OrcHouse;

public class OrcFactory implements  IGameFactory{
    @Override
    public ICharacter createCharacter() {
        return new Orc();
    }

    @Override
    public IHouse createHouse() {
        return new OrcHouse();
    }

    @Override
    public ICity createCity() {
        return new OrcCity();
    }
}

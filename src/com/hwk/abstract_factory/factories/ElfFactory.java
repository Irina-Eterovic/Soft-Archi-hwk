package com.hwk.abstract_factory.factories;

import com.hwk.abstract_factory.products.character.Elf;
import com.hwk.abstract_factory.products.character.ICharacter;
import com.hwk.abstract_factory.products.city.ElfCity;
import com.hwk.abstract_factory.products.city.ICity;
import com.hwk.abstract_factory.products.house.ElfHouse;
import com.hwk.abstract_factory.products.house.IHouse;

public class ElfFactory implements IGameFactory {
    @Override
    public ICharacter createCharacter() {
        return new Elf();
    }

    @Override
    public IHouse createHouse() {
        return new ElfHouse();
    }

    @Override
    public ICity createCity() {
        return new ElfCity();
    }
}

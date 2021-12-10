package com.hwk.abstract_factory.factories;

import com.hwk.abstract_factory.products.character.ICharacter;
import com.hwk.abstract_factory.products.city.ICity;
import com.hwk.abstract_factory.products.house.IHouse;

public interface IGameFactory {
    public ICharacter createCharacter();
    public IHouse createHouse();
    public ICity createCity();
}

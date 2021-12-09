package com.hwk.abstract_factory;

import com.hwk.abstract_factory.factories.IGameFactory;
import com.hwk.abstract_factory.products.character.ICharacter;
import com.hwk.abstract_factory.products.city.ICity;
import com.hwk.abstract_factory.products.house.IHouse;

public class Application {
    private ICharacter character;
    private IHouse house;
    private ICity city;

    public Application(IGameFactory game) {
        this.character = game.createCharacter();
        this.house = game.createHouse();
        this.city = game.createCity();
    }

    public void play() {
        System.out.println("Rendering a Application");
        this.character.fight();
        this.character.work();
        this.house.getCharacters();
        this.city.getHouses();
    }
}

package com.hwk.abstract_factory.products.house;

import com.hwk.abstract_factory.products.character.Elf;

import java.util.List;

public interface IHouse {
    public <T> List<T> getCharacters();
}

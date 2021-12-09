package com.hwk.abstract_factory.products.house;

import com.hwk.abstract_factory.products.character.Elf;
import com.hwk.abstract_factory.products.character.Orc;

import java.util.ArrayList;
import java.util.List;

public class OrcHouse implements IHouse {
    private List<Orc> assignedOrcs;

    @Override
    public <T> List<T> getCharacters() {
        System.out.println("Some orcs live in this cave");
        return (List<T>) this.assignedOrcs;
    }
}

package com.hwk.abstract_factory.products.house;

import com.hwk.abstract_factory.products.character.Elf;

import java.util.ArrayList;
import java.util.List;

public class ElfHouse implements IHouse {
    private List<Elf> assignedElfs;
    @Override
    public <T> List<T> getCharacters() {
        System.out.println("Some elves live in this tower");
        return (List<T>) this.assignedElfs;
    }
}

package com.hwk.abstract_factory.products.character;

public class Elf implements ICharacter {
    @Override
    public void fight() {
        System.out.println("Elf fights with Magic");
    }

    @Override
    public void work() {
        System.out.println("Elf works");
    }
}

package com.hwk.abstract_factory.products.character;

public class Orc implements ICharacter {
    @Override
    public void fight() {
        System.out.println("Orc fights with a Labrys");
    }

    @Override
    public void work() {
        System.out.println("Orc works");
    }
}

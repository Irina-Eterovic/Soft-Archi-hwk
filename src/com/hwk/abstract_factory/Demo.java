package com.hwk.abstract_factory;

import com.hwk.abstract_factory.factories.ElfFactory;
import com.hwk.abstract_factory.factories.IGameFactory;
import com.hwk.abstract_factory.factories.OrcFactory;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Start game");

        System.out.println("Start orcs");
        IGameFactory orcGame = new OrcFactory();
        Application app = new Application(orcGame);
        app.play();

        System.out.println("Start elfs");
        IGameFactory elfGame = new ElfFactory();
        Application app2 = new Application(elfGame);
        app2.play();

        System.out.println("End game");
    }
}

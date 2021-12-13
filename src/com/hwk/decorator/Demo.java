package com.hwk.decorator;

import com.hwk.decorator.decorators.DarkUsername;
import com.hwk.decorator.decorators.LightUsername;

public class Demo {
    public static void main(String[] args) {
        BaseUsername baseUsername = new BaseUsername("Anya");
        DarkUsername darkUsername = new DarkUsername(baseUsername);
        LightUsername lightUsername = new LightUsername(darkUsername);
        Application app = new Application(lightUsername);
        app.showUsername(baseUsername.getUsername());
    }
}

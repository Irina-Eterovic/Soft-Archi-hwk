package com.hwk.decorator.decorators;

import com.hwk.decorator.IFormatter;

public class DarkUsername extends UsernameDecorator {

    public DarkUsername(IFormatter wrappee) {
        super(wrappee);
    }

    @Override
    public String formatUsername(String username) {
        String darkUsername =  "\u001B[1m !!!"+  this.wrappee.formatUsername(username) +"\u001B[1m !!! (╯°□°)╯︵ ┻━┻";
        return darkUsername;
    }
}

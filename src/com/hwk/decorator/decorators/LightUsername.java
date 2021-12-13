package com.hwk.decorator.decorators;

import com.hwk.decorator.IFormatter;

public class LightUsername extends UsernameDecorator {
    public LightUsername(IFormatter wrappee) {
        super(wrappee);
    }

    @Override
    public String formatUsername(String username) {
       ;
        return "\033[3m ***"+ this.wrappee.formatUsername(username)+"*** ┬─┬ノ( º _ ºノ) \033[0m";
    }
}

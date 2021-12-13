package com.hwk.decorator.decorators;

import com.hwk.decorator.IFormatter;

public abstract class UsernameDecorator implements IFormatter {
    protected IFormatter wrappee;

    public UsernameDecorator(IFormatter wrappee) {
        this.wrappee = wrappee;
    }
    @Override
    public abstract  String formatUsername(String username);
}

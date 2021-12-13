package com.hwk.decorator.decorators;

import com.hwk.decorator.IFormatter;

public class BaseUsername implements IFormatter {
    @Override
    public String formatUsername(String username) {
        return username;
    }
}

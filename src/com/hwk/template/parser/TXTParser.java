package com.hwk.template.parser;

import com.hwk.template.user.UserData;

public class TXTParser extends UserParser {
    @Override
    protected boolean validPath(String path) {
        return path.contains(".txt");
    }

    @Override
    public UserData parseData(String path) {
        System.out.println("Reading txt...");
        return new UserData("Juan","Lopez","CTO");
    }
}

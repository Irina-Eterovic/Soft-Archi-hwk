package com.hwk.template.parser;

import com.hwk.template.user.UserData;

public class XMLParser extends UserParser {
    @Override
    protected boolean validPath(String path) {
        return path.contains(".xml");
    }

    @Override
    public UserData parseData(String path) {
        System.out.println("Reading xml...");
        return new UserData("Tom","Holland","actor");
    }
}

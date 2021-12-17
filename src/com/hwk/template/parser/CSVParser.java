package com.hwk.template.parser;

import com.hwk.template.user.UserData;

public class CSVParser extends UserParser {
    @Override
    protected boolean validPath(String path) {
        return path.contains(".csv");
    }

    @Override
    public UserData parseData(String path) {
        System.out.println("Reading csv...");
        return new UserData("Dan","Reynolds","singer");
    }
}

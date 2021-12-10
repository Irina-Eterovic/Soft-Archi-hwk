package com.hwk.singleton;

import com.hwk.singleton.drivers.IDriver;

public abstract class AbstractFileParser {
    protected IDriver fileParser;

    abstract public void createDriver();
    public String getUsers(String filePath){
        return  fileParser.readFile(filePath);
    }
}

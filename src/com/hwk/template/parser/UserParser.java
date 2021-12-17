package com.hwk.template.parser;

import com.hwk.template.user.UserData;

public abstract class UserParser {

    public UserData parse(String path){
        if(validPath(path)){
            return parseData(path);
        }

        return null;
    }

    protected abstract boolean validPath(String path);
    public abstract UserData parseData(String path);

}

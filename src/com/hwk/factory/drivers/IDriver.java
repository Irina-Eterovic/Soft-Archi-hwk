package com.hwk.factory.drivers;

public interface IDriver {
    public String readFile(String path);
    public void writeFile(String path, String content);
}

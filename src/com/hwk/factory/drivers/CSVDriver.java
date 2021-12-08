package com.hwk.factory.drivers;

public class CSVDriver implements IDriver{
    @Override
    public String readFile(String path) {
        System.out.println("LEI UN CSV");
        String userData = "Lets pretend this was on a CSV";
        return userData;
    }

    @Override
    public void writeFile(String path, String content) {
        System.out.println("ESCRIBI " + content + "EN UN CSV");
    }
}

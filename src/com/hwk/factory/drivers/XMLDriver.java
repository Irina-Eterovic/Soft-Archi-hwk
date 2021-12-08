package com.hwk.factory.drivers;

public class XMLDriver  implements IDriver{
    @Override
    public String readFile(String path) {
        System.out.println("LEI UN XML");
        String userData = "Lets pretend this was on a XML";
        return userData;
    }

    @Override
    public void writeFile(String path, String content) {
        System.out.println("ESCRIBI " + content + "EN UN XML");
    }
}


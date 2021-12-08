package com.hwk.factory;

public class Application {
    public static void main(String[] args){
        AbstractFileParser csvFileParser = new CSVFileParser();
        AbstractFileParser xmlFileParser = new XMLFileParser();
        csvFileParser.createDriver();
        csvFileParser.getUsers("Any/path/hello");
        xmlFileParser.createDriver();
        xmlFileParser.getUsers("Any/path/hello2");
    }
}

package com.hwk.factory;

import com.hwk.factory.drivers.CSVDriver;

public class CSVFileParser extends AbstractFileParser{
    @Override
    public void createDriver() {
        CSVDriver csvFileParser = new CSVDriver();
        this.fileParser = csvFileParser;
    }
}

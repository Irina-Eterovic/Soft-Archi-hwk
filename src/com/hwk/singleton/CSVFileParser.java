package com.hwk.singleton;

import com.hwk.singleton.drivers.CSVDriver;

public class CSVFileParser extends AbstractFileParser{
    @Override
    public void createDriver() {
        CSVDriver csvFileParser = new CSVDriver();
        this.fileParser = csvFileParser;
    }
}

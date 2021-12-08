package com.hwk.factory;

import com.hwk.factory.drivers.CSVDriver;
import com.hwk.factory.drivers.XMLDriver;

public class XMLFileParser extends AbstractFileParser{
    @Override
    public void createDriver() {
        XMLDriver xmlFileParser = new XMLDriver();
        this.fileParser = xmlFileParser;
    }
}

package com.hwk.singleton;

import com.hwk.singleton.drivers.XMLDriver;

public class XMLFileParser extends AbstractFileParser{
    @Override
    public void createDriver() {
        XMLDriver xmlFileParser = new XMLDriver();
        this.fileParser = xmlFileParser;
    }
}

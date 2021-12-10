package com.hwk.singleton.drivers;

import com.hwk.singleton.Logger;

public class CSVDriver implements IDriver{
    @Override
    public String readFile(String path) {
        System.out.println("LEI UN CSV");
        String userData = "Lets pretend this was on a CSV";
        Logger logger = Logger.getInstance();
        System.out.println(logger.logInfo("Infomation is being read from an XML file with path "+path));
        return userData;
    }

    @Override
    public void writeFile(String path, String content) {
        System.out.println("ESCRIBI " + content + "EN UN CSV");
        Logger logger = Logger.getInstance();
        logger.logInfo("Infomation is being written into a CVS");
    }
}

package com.hwk.singleton.drivers;

import com.hwk.singleton.Logger;

public class XMLDriver  implements IDriver{
    @Override
    public String readFile(String path) {
        System.out.println("LEI UN XML");
        String userData = "Lets pretend this was on a XML";
        Logger logger = Logger.getInstance();
        System.out.println(logger.logInfo("Infomation is being read from the csv with path "+path));
        return userData;
    }

    @Override
    public void writeFile(String path, String content) {
        System.out.println("ESCRIBI " + content + "EN UN XML");
        Logger logger = Logger.getInstance();
        logger.logInfo("Infomation is being written into a XML file");
    }
}


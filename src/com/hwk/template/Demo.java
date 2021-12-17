package com.hwk.template;

import com.hwk.adapter.UserInformation;
import com.hwk.template.parser.CSVParser;
import com.hwk.template.parser.TXTParser;
import com.hwk.template.parser.UserParser;
import com.hwk.template.parser.XMLParser;
import com.hwk.template.user.UserData;

public class Demo {

    public static void main(String[] args) {
        System.out.println("starting Template Method");

        UserParser xmlParser = new XMLParser();
        UserParser csvParser = new CSVParser();
        UserParser txtParser = new TXTParser();

        UserData result = xmlParser.parse("hola/amigos/file.xml");
        csvParser.parse("hola/amigos/file.csv");
        txtParser.parse("hola/amigos/file.txt");

        result.printUserData();
        result = xmlParser.parse("NOT AN XML FILE");
        System.out.println(result);

        System.out.println("ending Template Method");
    }
}


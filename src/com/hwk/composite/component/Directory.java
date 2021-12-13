package com.hwk.composite.component;

import com.hwk.factory.drivers.IDriver;

import java.util.ArrayList;

public class Directory implements IDirectory {

    private ArrayList<IDirectory> files;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    @Override
    public Integer getFileSize() {
        Integer totalFileSize = 0;
        for (IDirectory file : files){
             totalFileSize += file.getFileSize();
        }
        return totalFileSize;
    }

    @Override
    public void printName(String spaces) {
        System.out.println(this.name);
        for (IDirectory file : files) {
            spaces = spaces+ "-";
            file.printName(spaces);
        }
    }

    public void add(IDirectory file){
        files.add(file);

    }
}

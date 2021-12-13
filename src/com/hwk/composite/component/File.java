package com.hwk.composite.component;

public class File implements  IDirectory{
    String name;
    Integer fileSize;

    public File(String name, Integer fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
    public void printName(String spaces){
        System.out.println(spaces + getName());
    }
}

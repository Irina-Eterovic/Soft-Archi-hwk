package com.hwk.proxy.image;

public class Image {
    public String id;
    public String name;
    public Classification classification;

    public Image(String id, String name, Classification classification) {
        this.id = id;
        this.name = name;
        this.classification = classification;
    }
}

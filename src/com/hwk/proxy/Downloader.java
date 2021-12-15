package com.hwk.proxy;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.Image;

import java.util.HashMap;

public class Downloader {
    private IImageAccesor api;

    public Downloader(IImageAccesor api) {
        this.api = api;
    }

    public void renderImage(String id, Integer age){
        Image img = this.api.getImage(id,age);
        if (img != null ) {
            System.out.println("-------------------------------");
            System.out.println("ID: " + img.id);
            System.out.println("Title: " + img.name);
            System.out.println("Video: " + img.classification);
            System.out.println("-------------------------------");
        }
    }

}

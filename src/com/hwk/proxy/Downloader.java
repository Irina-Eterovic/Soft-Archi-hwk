package com.hwk.proxy;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.Image;

import java.util.HashMap;

public class Downloader {
    private IImageAccesor api;

    public Downloader(IImageAccesor api) {
        this.api = api;
    }

    public void renderRegularImage(String id){
        Image img = this.api.getRegularImage(id);
        System.out.println("-------------------------------");
        System.out.println("ID: " + img.id);
        System.out.println("Title: " + img.name);
        System.out.println("Video: " + img.classification);
        System.out.println("-------------------------------");
    }

    public void renderForbiddenImage(String id){
        Image img = this.api.getRImage(id);
        System.out.println("-------------------------------");
        System.out.println("ID: " + img.id);
        System.out.println("Title: " + img.name);
        System.out.println("Video: " + img.classification);
        System.out.println("-------------------------------");
    }

}

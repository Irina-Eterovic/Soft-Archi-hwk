package com.hwk.proxy;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.ImageProvider;
import com.hwk.proxy.proxies.ImageProxy;

public class Application {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start");
        ImageProvider provider = new ImageProvider();
        IImageAccesor proxy = new ImageProxy(provider);
        Downloader downloader = new Downloader(proxy);
        downloader.renderImage("donuts",29);
        long endTime = System.currentTimeMillis();
        System.out.println("time: "+ (endTime - startTime) + "ms");
        downloader.renderImage("donuts",29);
        System.out.println("time: "+ (System.currentTimeMillis() - endTime) + "ms");
        downloader.renderImage("dangerous",14);
        downloader.renderImage("dangerous",28);
        System.out.println("End");
    }
}

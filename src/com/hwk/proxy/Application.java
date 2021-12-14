package com.hwk.proxy;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.ImageProvider;
import com.hwk.proxy.proxies.ImageCacheProxy;

public class Application {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start amazing video app");
        ImageProvider provider = new ImageProvider();
        IImageAccesor proxy = new ImageCacheProxy(provider);
        Downloader downloader = new Downloader(proxy);
        downloader.renderRegularImage("donuts");
        long endTime = System.currentTimeMillis();
        System.out.println("time: "+ (endTime - startTime) + "ms");
        downloader.renderRegularImage("donuts");
        System.out.println("time: "+ (System.currentTimeMillis() - endTime) + "ms");
        System.out.println("End amazing video app");
    }
}

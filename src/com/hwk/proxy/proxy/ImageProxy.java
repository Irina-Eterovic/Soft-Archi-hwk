package com.hwk.proxy.proxies;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.Image;

import java.util.HashMap;

public class ImageProxy implements IImageAccesor {
    private IImageAccesor api;
    private HashMap<String, Image> generalCache = new HashMap<String, Image>();


    public ImageProxy(IImageAccesor api) {
        this.api = api;
    }
    @Override
    public Image getImage(String id, Integer age) {
        Image result = checkAccess(id, age);
        return result;
    }

    private Image checkAccess(String id, Integer age) {
        Image result;
        if (age >= 18){
            System.out.println("User access authorized, proceed with caution");
            result = saveToCache(id, age);
        }
        else {
            System.out.println("User access denied");
            result = null;
        }
        return result;
    }

    private Image saveToCache(String id, Integer age) {
        Image result = generalCache.get(id);
        if(result == null){
            result = api.getImage(id,age);
            generalCache.put(id, result);
        }
        return result;
    }
}

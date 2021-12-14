package com.hwk.proxy.proxies;

import com.hwk.proxy.image.IImageAccesor;
import com.hwk.proxy.image.Image;

import java.util.HashMap;

public class ImageCacheProxy implements IImageAccesor {
    private IImageAccesor api;
    private HashMap<String, Image> generalCache = new HashMap<String, Image>();


    public ImageCacheProxy(IImageAccesor api) {
        this.api = api;
    }
    @Override
    public Image getImage(String id) {
        Image result = generalCache.get(id);
        if(result == null){
            result = api.getImage(id);
            generalCache.put(id, result);
        }
        return result;
    }
}

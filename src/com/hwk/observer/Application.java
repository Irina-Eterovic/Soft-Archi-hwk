package com.hwk.observer;

import com.hwk.observer.event.EventManager;
import com.hwk.observer.event.EventTypeName;
import com.hwk.observer.listener.EmailListener;
import com.hwk.observer.listener.PinterestListener;
import com.hwk.observer.listener.SMSListener;
import com.hwk.observer.publisher.Authentication;

public class Application {
    public static void main(String[] args) {
        EventManager manager = new EventManager(EventTypeName.REGISTER, EventTypeName.CHANGED_PASSWORD);
        manager.attach(EventTypeName.REGISTER, new PinterestListener());
        manager.attach(EventTypeName.REGISTER, new SMSListener());
        manager.attach(EventTypeName.REGISTER, new EmailListener());
        manager.attach(EventTypeName.CHANGED_PASSWORD,new SMSListener());
        Authentication authentication = new Authentication(manager, "DGDGJH6454DFG6DS1B6");
        authentication.register("bananita@email.com");
        authentication.passwordChange("ofmgodf","gmoremg","bananita@email.com");
    }
}

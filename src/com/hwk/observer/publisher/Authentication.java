package com.hwk.observer.publisher;

import com.hwk.observer.listener.Event;
import com.hwk.observer.event.EventManager;
import com.hwk.observer.event.EventTypeName;

public class Authentication {
    private EventManager manager;
    private String token;

    public Authentication(EventManager manager, String token) {
        this.manager = manager;
        this.token = token;
    }
    public void register(String email){
        System.out.println("Registering user to app...");
        Event event = new Event(EventTypeName.REGISTER, token);
        event.setEmail(email);
        manager.notifyEvent(event);
    }
    public void passwordChange(String oldPassword, String newPassword, String email) {
        System.out.println("Changing password, please remember not to share your password with anyone");
        Event event = new Event(EventTypeName.CHANGED_PASSWORD, token);
        event.setEmail(email);
        manager.notifyEvent(event);
    }
}

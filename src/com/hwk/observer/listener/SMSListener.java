package com.hwk.observer.listener;

import com.hwk.observer.event.EventTypeName;

public class SMSListener implements IListener {
    @Override
    public void notifyAction(Event eventContext) {
        EventTypeName typeName = eventContext.getName();
        registerEvent(eventContext, typeName);
        changePasswordEvent(eventContext, typeName);
    }

    private void changePasswordEvent(Event eventContext, EventTypeName typeName) {
        if (typeName == EventTypeName.CHANGED_PASSWORD){
            System.out.println("Password for : "+ eventContext.getEmail()+" Has been changed. If this wasn't you pelase contact us at ...");
        }
    }

    private void registerEvent(Event eventContext, EventTypeName typeName) {
        if (typeName == EventTypeName.REGISTER){
            System.out.println("Hello! "+ eventContext.getEmail()+" Thank you for registering to out App!");
        }
    }
}

package com.hwk.observer.listener;

public class EmailListener implements IListener {
    @Override
    public void notifyAction(Event eventContext) {
        System.out.println("Sending email to web master ...");
        System.out.println("New User registered: "+eventContext.getEmail()+ "token: "+ eventContext.getToken());
    }
}

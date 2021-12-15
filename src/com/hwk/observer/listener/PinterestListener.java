package com.hwk.observer.listener;

public class PinterestListener implements IListener {
    @Override
    public void notifyAction(Event eventContext) {
        System.out.println("Pinterest api request!");
        System.out.println("Obtained profile photo for user: " + eventContext.getEmail());
    }
}

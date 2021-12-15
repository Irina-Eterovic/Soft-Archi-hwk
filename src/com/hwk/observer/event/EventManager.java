package com.hwk.observer.event;

import com.hwk.observer.listener.Event;
import com.hwk.observer.listener.IListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<EventTypeName, List<IListener>> listeners = new HashMap<>();
    public EventManager(EventTypeName ... operations) {
        for (EventTypeName operation : operations){
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void attach(EventTypeName eventName, IListener listener){
        List<IListener> notified = listeners.get(eventName);
        notified.add(listener);
    }

    public void detach(EventTypeName eventName, IListener listener){
        List<IListener> notified = listeners.get(eventName);
        notified.remove(listener);
    }
    public void notifyEvent(Event event) {
        List<IListener> toNotify = listeners.get(event.getName());
        for(IListener listener : toNotify){
            listener.notifyAction(event);
        }
    }
}

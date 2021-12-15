package com.hwk.observer.listener;

import com.hwk.observer.event.EventTypeName;

public class Event {
    private EventTypeName name;
    private String token;
    private String email;

    public Event(EventTypeName eventType, String token) {
        this.name = eventType;
        this.token = token;
    }

    public void setName(EventTypeName name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public EventTypeName getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

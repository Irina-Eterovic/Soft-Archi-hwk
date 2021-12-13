package com.hwk.decorator;

public class BaseUsername implements IFormatter {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BaseUsername(String username) {
        this.username = username;
    }

    @Override
    public String formatUsername(String username) {
        return username;
    }
}

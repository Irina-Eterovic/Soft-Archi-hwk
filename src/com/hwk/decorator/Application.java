package com.hwk.decorator;

public class Application {
    private IFormatter formatter;

    public Application(IFormatter formatter) {
        this.formatter = formatter;
    }
    public void showUsername(String username){
        System.out.println(formatter.formatUsername(username));
    }
}

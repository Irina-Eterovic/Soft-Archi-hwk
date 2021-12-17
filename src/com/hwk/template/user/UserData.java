package com.hwk.template.user;

public class UserData {
    private final String job;
    private final String lastname;
    private final String name;

    public UserData(String name, String lastname, String job) {
        this.name = name;
        this.lastname = name;
        this.job = job;
    }

    public void printUserData() {
        System.out.println(name+" "+lastname+" "+job);
    }
}

package com.hwk.adapter.database_providers;

public class MySql  {
    public void storeData(String query) {
        System.out.println("Data was stored to MySql"+query);
    }

    public String getData(String query) {
        System.out.println("Query being executed in Mysql "+query);
        return "Juan Perez,1500$,true,2000314";
    }
}

package com.hwk.adapter.database_providers;

public class DynamoDB  {
    public void storeData(String query) {
        System.out.println("Data was stored to DynamoDB"+query);
    }

    public String getData(String query) {
        System.out.println("Query being executed in Dynamo "+query);
        return "Juan Perez, 772284676";
    }
}

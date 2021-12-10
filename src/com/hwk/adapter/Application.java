package com.hwk.adapter;

import com.hwk.adapter.database_providers.DynamoDB;
import com.hwk.adapter.database_providers.MySql;
import com.hwk.adapter.providers.DynamoDBProvider;
import com.hwk.adapter.providers.IDatabaseProvider;
import com.hwk.adapter.providers.MysqlProvider;

public class Application {
    public static void main(String[] args){
        System.out.println("Starting of adapter example");
        UserInformation userInformation = new UserInformation();
        userInformation.setName("Juan Pepito");
        userInformation.setPhone("7228467");
        userInformation.setAccountNumber("36000091432");
        userInformation.setIncome("7000$");
        userInformation.setHomeOwner(true);

        IDatabaseProvider providerDynamo = new DynamoDBProvider( new DynamoDB());
        IDatabaseProvider providerMySql = new MysqlProvider( new MySql());
        providerDynamo.setData(userInformation);
        providerMySql.setData(userInformation);
        System.out.println("End of adapter example");
    }
}

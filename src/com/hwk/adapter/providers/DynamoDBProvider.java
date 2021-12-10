package com.hwk.adapter.providers;

import com.hwk.adapter.UserInformation;
import com.hwk.adapter.database_providers.DynamoDB;

public class DynamoDBProvider implements IDatabaseProvider {
    private DynamoDB dynamoDBAdaptee;

    public DynamoDBProvider(DynamoDB dynamoDBAdaptee) {
        this.dynamoDBAdaptee = dynamoDBAdaptee;
    }

    @Override
    public void setData(UserInformation userInformation) {
        String queryDynamo = "{'name':"+userInformation.getName()+
                ",'income':"+userInformation.getIncome()+
                ",'homeowner':"+userInformation.getHomeOwner()+"}";
        this.dynamoDBAdaptee.storeData(queryDynamo);
    }
}

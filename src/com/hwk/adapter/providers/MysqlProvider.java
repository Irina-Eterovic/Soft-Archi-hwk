package com.hwk.adapter.providers;

import com.hwk.adapter.UserInformation;
import com.hwk.adapter.database_providers.MySql;

public class MysqlProvider implements IDatabaseProvider {
    private MySql mySqlAdaptee;

    public MysqlProvider(MySql mySqlAdaptee) {
        this.mySqlAdaptee = mySqlAdaptee;
    }

    @Override
    public void setData(UserInformation userInformation) {

        String queryMySQL = "UPDATE TABLE UserContact(name,phone,) VALUES "+
                "("+ userInformation.getName()+","+userInformation.getPhone()+");";
        this.mySqlAdaptee.storeData(queryMySQL);
    }
}

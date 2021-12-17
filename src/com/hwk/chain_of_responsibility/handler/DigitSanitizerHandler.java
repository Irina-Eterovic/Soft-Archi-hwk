package com.hwk.chain_of_responsibility.handler;

import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

public class DigitSanitizerHandler extends RequestSanitizer{
    @Override
    public UserInformationResponse handle(UserInformationRequest context) {
        String numberOnly= context.getSsn().replaceAll("[^0-9]", "");
        if(numberOnly.equals("")){
            numberOnly = "0";
        }
        context.setSsn(numberOnly);
        return follow(context);
    }
}

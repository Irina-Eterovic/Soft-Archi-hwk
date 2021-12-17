package com.hwk.chain_of_responsibility.handler;

import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

import java.util.regex.Pattern;

public class EmailSanitizerHandler extends RequestSanitizer{
    @Override
    public UserInformationResponse handle(UserInformationRequest context) {
        String emailPattern = "[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}";
        if(!Pattern.matches(emailPattern,context.getEmail())){
            return new UserInformationResponse("400", new UserInformationRequest(null,context.getSsn(),context.getBirthdate()));
        }
        else {
           return follow(context);
        }
    }
}

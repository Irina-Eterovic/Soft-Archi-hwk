package com.hwk.chain_of_responsibility.handler;

import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

import java.util.regex.Pattern;

public class DateSanitizerHandler extends RequestSanitizer{
    @Override
    public UserInformationResponse handle(UserInformationRequest context) {
        String datePatter = " ^((?:(?:1[6-9]|2[0-9])\\d{2})(-)(?:(?:(?:0[13578]|1[02])(-)31)|((0[1,3-9]|1[0-2])(-)(29|30))))$|^(?:(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))(-)02(-)29)$|^(?:(?:1[6-9]|2[0-9])\\d{2})(-)(?:(?:0[1-9])|(?:1[0-2]))(-)(?:0[1-9]|1\\d|2[0-8])$";
        if (!Pattern.matches(datePatter,context.getBirthdate())){
            context.setDate("1991-01-01");
        }
        return follow(context);
    }
}

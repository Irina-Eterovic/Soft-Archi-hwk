package com.hwk.chain_of_responsibility;

import com.hwk.chain_of_responsibility.handler.DateSanitizerHandler;
import com.hwk.chain_of_responsibility.handler.DigitSanitizerHandler;
import com.hwk.chain_of_responsibility.handler.EmailSanitizerHandler;
import com.hwk.chain_of_responsibility.handler.IRequestHandler;
import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

public class Demo {
    public static void main(String[] args) {
        UserInformationRequest request = new UserInformationRequest("ana@email.com","t23yu8587i","2000-02-21");
        IRequestHandler emailSanitizerHandler = new EmailSanitizerHandler();
        IRequestHandler dateSanitizerHandler = new DateSanitizerHandler();
        IRequestHandler digitSanitizerHandler = new DigitSanitizerHandler();
        emailSanitizerHandler.setNext(digitSanitizerHandler).setNext(dateSanitizerHandler);
        UserInformationResponse response = emailSanitizerHandler.handle(request);
        response.printResponse();


    }
}

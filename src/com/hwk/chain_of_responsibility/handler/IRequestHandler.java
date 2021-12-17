package com.hwk.chain_of_responsibility.handler;

import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

public interface IRequestHandler {
    IRequestHandler setNext(IRequestHandler next);
    UserInformationResponse handle(UserInformationRequest context);
}

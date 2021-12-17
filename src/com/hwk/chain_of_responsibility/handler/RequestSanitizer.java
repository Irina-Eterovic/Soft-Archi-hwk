package com.hwk.chain_of_responsibility.handler;

import com.hwk.chain_of_responsibility.user_information.UserInformationRequest;
import com.hwk.chain_of_responsibility.user_information.UserInformationResponse;

public abstract class RequestSanitizer implements IRequestHandler{

    private IRequestHandler next;

    @Override
    public IRequestHandler setNext(IRequestHandler next) {
        this.next = next;
        return next;
    }

    @Override
    public abstract UserInformationResponse handle(UserInformationRequest context);

    protected UserInformationResponse follow(UserInformationRequest context){
        if (next == null){
            return new UserInformationResponse("finished",context);
        }
        else {
            return next.handle(context);
        }
    }
}

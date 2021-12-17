package com.hwk.chain_of_responsibility.user_information;

public class UserInformationResponse {
    private final String status;
    private UserInformationRequest userInformationRequest;

    public UserInformationResponse(String status, UserInformationRequest userInformationRequest) {
        this.status = status;
        this.userInformationRequest = userInformationRequest;
    }
    public void printResponse(){
        System.out.println("Status: "+this.status);
        userInformationRequest.printUserInformation();
    }
}
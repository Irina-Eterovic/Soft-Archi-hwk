package com.hwk.chain_of_responsibility.user_information;

public class UserInformationRequest {
    private String email;
    private String ssn;
    private String birthdate;

    public UserInformationRequest(String email, String ssn, String birthdate) {
        this.email = email;
        this.ssn = ssn;
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return this.ssn;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setSsn(String numberOnly) {
        this.ssn = numberOnly;
    }

    public void setDate(String date) {
        this.birthdate = date;
    }

    public void printUserInformation() {
        System.out.println("Email: "+this.email);
        System.out.println("SSN:"+ this.ssn);
        System.out.println("Birthdate:"+ this.birthdate);
    }
}

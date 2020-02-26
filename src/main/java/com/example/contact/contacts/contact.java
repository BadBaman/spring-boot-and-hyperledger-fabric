package com.example.contact.contacts;

public class contact {


    //定义属性
    private long id;
    private String firstName;
    private String lastName;
    private String PhoneNumber;
    private String emailAddress;


    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setId(Long id){
        this.id=id;
    }
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}

package com.tttt.restapi.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class UserDto {
    String userName;
    String password;
    String firstName;
    String lastName;
    @JsonFormat(pattern="yyyy-MM-dd")
    Date dateOfBirth;
    String address;
    String phoneNumber;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public UserDto(){
    
    };
    public UserDto(String userName,String firstName,String password, String lastName, Date dateOfBirth, String address, String phoneNumber){
        this.userName = userName;
         this.firstName = firstName;
         this.lastName = lastName;
         this.password = password;
         this.dateOfBirth = dateOfBirth;
         this.address = address;
         this.phoneNumber = phoneNumber;
    }
    
}

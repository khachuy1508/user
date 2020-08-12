package com.tttt.restapi.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable{
    @Id
    String id;
    String userName;
    String password;
    String firstName;
    String lastName;
    @JsonFormat(pattern="yyyy-MM-dd")
    Date dateOfBirth;
    String address;
    String phoneNumber;
     public User(String userName, String password,String firstName, String lastName, Date dateOfBirth, String address, String phoneNumber){
         this.userName = userName;
         this.password = password;
         this.firstName = firstName;
         this.lastName = lastName;
         this.dateOfBirth = dateOfBirth;
         this.address = address;
         this.phoneNumber = phoneNumber;
           
     }

    public User() {
        
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

     
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

    public String getId() {
        return id;
    }

    public String toString(){
        return  "User Name: "+userName+" First Name: "+firstName+"Last Name: "+lastName+" Date of birth: "+dateOfBirth+" Address: "+address+" Phone Number: "+phoneNumber;
        
    }
}

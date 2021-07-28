/****************************************************************
 * Purpose : To create a POJO class which holds user details.
 * @author Samarth BM

 ***************************************************************/

package com.bridgelabs;

public class UserRegistrationDetails {
    String firstName;
    String lastName;
    String mail;
    String mobileNumber;


    public UserRegistrationDetails() {

    }
    // Generating getters and setters.
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
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

/****************************************************************
 * Purpose : To create a POJO class which holds user details.
 * @author Samarth BM

 ***************************************************************/

package com.bridgelabs;

public class UserRegistrationDetails {
    String firstName;
    String lastName;

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
}

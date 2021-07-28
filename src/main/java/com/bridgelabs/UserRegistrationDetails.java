/****************************************************************
 * Purpose : To create a POJO class which holds user details.
 * @author Samarth BM

 ***************************************************************/

package com.bridgelabs;

public class UserRegistrationDetails {
    String firstName;

    public UserRegistrationDetails() {

    }
    // Generating getters and setters.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

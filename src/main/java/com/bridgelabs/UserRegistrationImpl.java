/****************************************************************
 * Purpose : Method to validate firs and last name using Regex.
 * @author Samarth BM
 ***************************************************************/
package com.bridgelabs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {

    /*
     * Purpose: Boolean method to validate first and last name.
     * Condition for regex is, first name and last name should start
     * with capital letter and name should have minimum 3 letters.
     *
     * @param firstName: First name to validate.
     */
    public boolean validateFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Returns false if user does not enter any name.
        if (name.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    /*
     * Purpose: Boolean method to validate first name. Condition for regex is, name
     * should start with capital letter and name should have minimum 3 letters.
     */
    public void validateUserDetails() {
        Scanner sc = new Scanner(System.in);
        UserRegistrationDetails userDetails = new UserRegistrationDetails();
        UserRegistrationImpl userRegistration = new UserRegistrationImpl();

        // validating first name.
        System.out.println("Enter your first name");
        userDetails.setFirstName(sc.next());
        boolean fName = userRegistration.validateFirstName(userDetails.getFirstName());
        if (fName)
            System.out.println("First name is valid");
        else
            System.out.println("First name is invalid");

        // validating last name.
        System.out.println("Enter your last name");
        userDetails.setLastName(sc.next());

        boolean lName = userRegistration.validateFirstName(userDetails.getLastName());
        if (lName == true)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is invalid");
        sc.close();
    }
}

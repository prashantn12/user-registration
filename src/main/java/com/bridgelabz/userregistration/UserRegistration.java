package com.bridgelabz.userregistration;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        // First name should start with a capital letter and have at least 3 characters
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(firstNamePattern);
    }
    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Prashant"));

    }
}

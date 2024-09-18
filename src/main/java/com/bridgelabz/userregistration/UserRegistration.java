package com.bridgelabz.userregistration;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        // First name should start with a capital letter and have at least 3 characters
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(firstNamePattern);

    }

    // UC2: Validate last name (Same as first name rule)
    public boolean validateLastName(String lastName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(lastNamePattern);
    }

    // UC3: Validate email
    public boolean validateEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";
        return email.matches(emailPattern);
    }

    // UC4: Validate mobile number (Country code followed by space and 10-digit number)
    public boolean validateMobileNumber(String mobileNumber) {
        String mobilePattern = "^[0-9]{2}\\s[0-9]{10}$";
        return mobileNumber.matches(mobilePattern);
    }

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Prashant"));
        System.out.println(userRegistration.validateLastName("Nangare"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(userRegistration.validateMobileNumber("91 8626047656"));
    }
}

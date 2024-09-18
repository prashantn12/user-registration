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

    // UC5: Validate Password (minimum 8 characters)
    public boolean validatePassword(String password) {
        // Regex to check if the password is at least 8 characters long
        String passwordPattern = "^.{8,}$";
        return password.matches(passwordPattern);


    }

    // UC5 and UC6: Validate Password with minimum 8 characters and at least 1 uppercase character
    public boolean validatePasswordRuleTwo(String password) {
        // Combine both rules into a simple regex pattern
        String passwordPattern = "^(?=.*[A-Z]).{8,}$";  // UC5: minimum 8 characters, UC6: at least 1 uppercase
        return password.matches(passwordPattern);
    }

    // UC5, UC6, UC7: Validate Password with combined regex pattern
    public boolean validatePasswordRuleThree(String password) {
        // Regex pattern to check:
        // 1. Minimum 8 characters
        // 2. At least 1 uppercase letter
        // 3. At least 1 numeric digit
        String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return password.matches(passwordPattern);
    }


    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Prashant"));
        System.out.println(userRegistration.validateLastName("Nangare"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(userRegistration.validateMobileNumber("91 8626047656"));
        System.out.println(userRegistration.validatePassword("Prashant"));
        System.out.println(userRegistration.validatePasswordRuleTwo("prashant"));
        System.out.println(userRegistration.validatePasswordRuleTwo("Prashant0872"));
    }
}

package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    // UC1: First Name Validation
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String firstName = "John";

        // Act
        boolean result = userRegistration.validateFirstName(firstName);

        // Assert
        Assert.assertTrue(result);
    }

    // UC2: Last Name Validation
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String lastName = "Doe";

        // Act
        boolean result = userRegistration.validateLastName(lastName);

        // Assert
        Assert.assertTrue(result);
    }

    // UC3: Email Validation
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String email = "abc.xyz@bl.co.in";

        // Act
        boolean result = userRegistration.validateEmail(email);

        // Assert
        Assert.assertTrue(result);
    }

    // UC4: Mobile Number Validation
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String mobileNumber = "91 9919819801";

        // Act
        boolean result = userRegistration.validateMobileNumber(mobileNumber);

        // Assert
        Assert.assertTrue(result);
    }
    // UC5: Test password with minimum 8 characters
    @Test
    public void givenPassword_WhenLessThan8Characters_ShouldReturnFalse() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String invalidPassword = "pass12";

        // Act
        boolean result = userRegistration.validatePassword(invalidPassword);

        // Assert
        Assert.assertFalse(result);
    }


    // UC5 and UC6: Test password with minimum 8 characters and at least 1 uppercase letter

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String password = "Password1";  // Valid password: at least 8 characters and 1 uppercase letter

        // Act
        boolean result = userRegistration.validatePassword(password);

        // Assert
        Assert.assertTrue(result);
    }

    // UC5, UC6, UC7: Test Password Validation
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        // Arrange
        UserRegistration userRegistration = new UserRegistration();
        String password = "Password1";

        // Act
        boolean result = userRegistration.validatePassword(password);

        // Assert
        Assertions.assertTrue(result);
    }
}

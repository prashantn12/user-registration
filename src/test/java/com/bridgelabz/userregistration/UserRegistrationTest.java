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

    
}

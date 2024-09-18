package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
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
}

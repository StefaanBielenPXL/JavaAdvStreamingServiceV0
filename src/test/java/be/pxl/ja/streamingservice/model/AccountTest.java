package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void returnsTrueIfProfileWasCreated() {
        // Arrange
        Account account = new Account("profile1@test.com", "test");
        // Act
        boolean result = account.getFirstProfile() != null;
        // Assert
        Assertions.assertFalse(result);
    }
}

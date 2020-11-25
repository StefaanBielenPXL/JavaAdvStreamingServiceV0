package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void init() {
        account = new Account("profile1@test.com", "test");
    }

    @Test
    public void returnsTrueIfProfileWasCreated() {
        // Act
        boolean result = account.getFirstProfile() != null;
        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    public void getFirstProfileReturnsProfile1() {
        // Arrange
        Profile profile = account.getFirstProfile();
        // Assert
        Assertions.assertEquals(profile.getName(), "profile1");
    }
}

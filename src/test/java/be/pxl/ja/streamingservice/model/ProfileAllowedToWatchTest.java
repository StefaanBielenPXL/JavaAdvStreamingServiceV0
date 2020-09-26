package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileAllowedToWatchTest {
    private Profile profile;
    private Content content;

    @BeforeEach
    public void init() {
        profile = new Profile();
        content = new Movie("Titanic", Rating.OLDER_KIDS);

    }

    @Test
    public void returnsFalseIfTooYoung() {
        // Arrange
        profile.setDateOfBirth(LocalDate.of(2015, 1, 1));
        // Act
        boolean result = profile.allowedToWatch(content);
        // Assert
        Assertions.assertFalse(result);
    }
}

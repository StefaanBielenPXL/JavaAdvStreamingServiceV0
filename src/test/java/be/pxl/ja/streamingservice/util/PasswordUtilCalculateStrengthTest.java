package be.pxl.ja.streamingservice.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordUtilCalculateStrengthTest {
    @Test
    public void scoreShouldBe0IfPasswordLengthIsLessThan6() {
        // Arrange
        String password = "hallo";
        // Act
        int result = PasswordUtil.calculateStrength(password);
        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    public void scoreShouldBe10IfPasswordIsVeryStrong() {
        // Arrange
        String password = "H4ll$allemaal";
        // Act
        int result = PasswordUtil.calculateStrength(password);
        // Assert
        Assertions.assertEquals(10, result);
    }

    @Test
    public void scoreShouldBe3IfPasswordLengthBetween6And10WithOnlySmallCaps() {
        // Arrange
        String password = "allemaal";
        // Act
        int result = PasswordUtil.calculateStrength(password);
        // Assert
        Assertions.assertEquals(3, result);
    }
}

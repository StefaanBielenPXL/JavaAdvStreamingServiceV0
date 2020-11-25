package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSetDurationTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void negativeDurationBecomesPositive() {
        // Act
        movie.setDuration(-200);
        // Assert
        assertEquals(200, movie.getDuration());
    }

    @Test
    public void positiveDurationStaysUnchanged() {
        // Act
        movie.setDuration(200);
        // Arrange
        assertEquals(200, movie.getDuration());
    }
}

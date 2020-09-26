package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Test class naming convention -> Classname + methodname + Test
public class MovieIsLongPlayingTimeTest {
    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void returnsFalseIfDurationLessThanLongPlayingTime() {
        // Arrange -> testdate klaarzetten
        movie.setDuration(Movie.LONG_PLAYING_TIME - 1);
        // Act -> testmethode aangeroepen
        boolean result = movie.isLongPlayingTime();
        // Assert -> voor de validatie
        assertFalse(result);
    }

    @Test
    public void returnsTrueIfDurationMoreThanLongPlayingTime() {
        // Arrange
        movie.setDuration(movie.LONG_PLAYING_TIME + 1);
        // Act
        boolean result = movie.isLongPlayingTime();
        // Assert
        assertTrue(result);
    }

    @Test
    public void returnsTrueIfDurationExactlyLongPlayingTime() {
        movie.setDuration(Movie.LONG_PLAYING_TIME);
        boolean result = movie.isLongPlayingTime();
        assertTrue(result);
    }
}

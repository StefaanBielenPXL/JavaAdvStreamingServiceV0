package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieToStringTest {

    @Test
    public void returnsTrueIfMovieHasTitleAndReleaseDate() {
        // Arrange
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        // Act
        movie.setReleaseDate(LocalDate.of(1998, 1, 7));
        boolean hasTitle = movie.toString().contains(movie.getTitle());
        String yearOfRelease = String.valueOf(movie.getReleaseDate().getYear());
        boolean hasReleaseDate = movie.toString().contains(yearOfRelease);

        // Assert
        assertTrue(hasTitle);
        assertTrue(hasReleaseDate);
    }

    @Test
    public void returnsTrueIfMovieOnlyHasTitle() {
        // Arrange
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        // Act
        boolean hasTitle = movie.toString().contains(movie.getTitle());

        // Assert
        assertTrue(hasTitle);
    }
}

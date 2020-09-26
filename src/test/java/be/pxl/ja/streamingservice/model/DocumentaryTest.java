package be.pxl.ja.streamingservice.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentaryTest {

    @Test
    public void testDocumentaryConstructor() {
        // Arrange
        Documentary documentary = new Documentary("Planet Earth", Rating.OLDER_KIDS);
        // Act -> hier niet van toepassing
        // Assert
        assertEquals("Planet Earth", documentary.getTitle());
        assertEquals(Rating.OLDER_KIDS, documentary.getMaturityRating());
        assertEquals(Genre.DOCUMENTARY, documentary.getGenre());
    }

}

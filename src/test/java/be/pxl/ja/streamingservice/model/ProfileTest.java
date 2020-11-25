package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfileTest {
    private Profile profile;
    private Content content;

    @BeforeEach
    public void init() {
        profile = new Profile("profile1");
        content = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void shouldAddContentToCurrentlyWatchingIfStartWatching() {
        // Act
        profile.startWatching(content);
        // Assert
        Assertions.assertEquals(content, profile.getCurrentlyWatching().getFirst());
    }

    @Test
    public void shouldRemoveContentFromCurrentlyWatchingAndAddToRecentlyWatchedWhenFinishWatching() {
        // Act
        profile.finishWatching(content);
        boolean result1 = profile.getCurrentlyWatching().contains(content);
        boolean result2 = profile.getRecentlyWatched().contains(content);
        // Assert
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
    }
}

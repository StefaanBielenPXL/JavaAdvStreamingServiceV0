package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;
    private Deque<Content> recentlyWatched;
    private Deque<Content> currentlyWatching;

    public Profile(String name) {
        this.name = name;
        recentlyWatched = new ArrayDeque<Content>();
        currentlyWatching = new ArrayDeque<Content>();
    }

    public boolean allowedToWatch(Content content) {
        if (dateOfBirth == null) {
            return false;
        }
        return getAge() >= content.getMaturityRating().getAge();
    }

    public int getAge() {
        return (int)ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void startWatching(Content content) {
        if (!currentlyWatching.contains(content)) {
            currentlyWatching.addFirst(content);
        }
    }

    public void finishWatching(Content content) {
        if (currentlyWatching.contains(content)) {
            recentlyWatched.add(content);
            currentlyWatching.remove(content);
        }
    }

    public Deque<Content> getRecentlyWatched() {
        return recentlyWatched;
    }

    public Deque<Content> getCurrentlyWatching() {
        return currentlyWatching;
    }

}

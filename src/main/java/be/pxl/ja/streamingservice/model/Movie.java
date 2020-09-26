package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {

    private String director;
    private LocalDate releaseDate;
    private int duration;

    private Genre genre;
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    public Movie(String title, Rating rating) {
        super(title, rating);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        // Implement this method correctly
        if (duration == 0) {
            return "?";
        } else if (duration < 60) {
            return duration + " min";
        } else if (duration % 60 == 0) {
            return duration/60 + " h";
        } else {
            int hours = duration/60;
            int minutes = duration % 60;
            return String.format("%d h %d min", hours, minutes);
        }

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.getTitle());
        if (releaseDate != null) {
            result.append(" ").append(releaseDate.getYear());
        }
        return result.toString();
    }
}

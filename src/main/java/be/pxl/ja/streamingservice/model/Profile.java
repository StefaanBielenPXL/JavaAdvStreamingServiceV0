package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public boolean allowedToWatch(Content content) {
        if (dateOfBirth == null) {
            return false;
        }
        return getAge() > content.getMaturityRating().getAge();
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
}

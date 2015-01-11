package ua.com.vendigo.knurozklad.domain.time;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.LocalTime;

import static ua.com.vendigo.knurozklad.util.Validator.validateTime;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Wrapper for {@link org.joda.time.LocalTime}. Simplifies JSON marshalling.
 */
public class SimpleTime {
    private final int hours;
    private final int minutes;

    public SimpleTime(int hours, int minutes) {
        validateTime(hours, minutes);
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @JsonIgnore
    public LocalTime getLocalTime() {
        return new LocalTime(hours, minutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleTime that = (SimpleTime) o;

        if (hours != that.hours) return false;
        if (minutes != that.minutes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hours;
        result = 31 * result + minutes;
        return result;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}

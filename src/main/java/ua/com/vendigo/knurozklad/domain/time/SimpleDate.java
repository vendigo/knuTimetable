package ua.com.vendigo.knurozklad.domain.time;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.LocalDate;

import static ua.com.vendigo.knurozklad.util.Validator.notPastYears;
import static ua.com.vendigo.knurozklad.util.Validator.validateDate;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Wrapper for {@link org.joda.time.LocalDate}. Simplifies JSON marshalling.
 */
public class SimpleDate {
    private final int year;
    private final int month;
    private final int day;

    public SimpleDate(int year, int month, int day) {
        validateDate(notPastYears(year), month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @JsonIgnore
    public LocalDate getLocalDate() {
        return new LocalDate(year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleDate that = (SimpleDate) o;

        if (day != that.day) return false;
        if (month != that.month) return false;
        if (year != that.year) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + day;
        return result;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

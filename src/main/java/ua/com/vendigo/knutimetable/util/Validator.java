package ua.com.vendigo.knutimetable.util;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Provides static methods for validation.
 */
public class Validator {

    private Validator() {
    }

    public static void validateTime(int hours, int minutes) {
        try {
            new LocalTime(hours, minutes);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void validateDate(int year, int month, int day) {
        try {
            new LocalDate(year, month, day);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Allows only years >= 2014
     *
     * @return year
     */
    public static int notPastYears(int year) {
        if (year < 2014) {
            throw new IllegalArgumentException("Year should be >=2014");
        }
        return year;
    }
}

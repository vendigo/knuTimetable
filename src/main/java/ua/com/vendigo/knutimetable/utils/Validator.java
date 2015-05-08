package ua.com.vendigo.knutimetable.utils;

/**
 * Provides static methods for validation input data.
 */
public class Validator {

    public static final int MAX_COURSE_NUMBER = 6;

    /**
     * Checks entity for being not null.
     * @param entity - entity to be checked
     * @param entityName - name for errorMessage
     * @return given entity
     */
    public static <T> T notNull(T entity, String entityName) {
        if (entity == null) {
            throw new IllegalArgumentException(entityName+" must be not null");
        }
        return entity;
    }

    /**
     * Checks string for being not null and not empty.
     * @param stringEntity - entity to be checked
     * @param stringEntityName - name for errorMessage
     * @return given entity
     */
    public static String notEmpty(String stringEntity, String stringEntityName) {
        notNull(stringEntity, stringEntityName);

        if (stringEntity.isEmpty()) {
            throw new IllegalArgumentException(stringEntityName+" must be not empty");
        }
        return stringEntity;
    }

    /**
     * Checks whether given number is positive.
     * @return given number
     */
    public static int isPositive(int number, String numberName) {
        if (number<=0) {
            throw new IllegalArgumentException(numberName+" must be a positive number");
        }
        return number;
    }

    /**
     * Checks whether given number is a valid course number.
     * Must be positive and less than MAX_COURSE_NUMBER.
     * @return given number
     */
    public static int isValidCourseNumber(int courseNumber, String courseNumberName) {
        isPositive(courseNumber, courseNumberName);

        if (courseNumber>MAX_COURSE_NUMBER) {
            throw new IllegalArgumentException(courseNumberName+" must be less than "+MAX_COURSE_NUMBER);
        }
        return courseNumber;
    }
}

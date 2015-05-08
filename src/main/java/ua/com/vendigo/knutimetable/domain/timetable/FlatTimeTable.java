package ua.com.vendigo.knutimetable.domain.timetable;

import ua.com.vendigo.knutimetable.domain.pair.FlatPair;

import java.time.DayOfWeek;
import java.util.Map;

import static ua.com.vendigo.knutimetable.utils.Validator.isValidCourseNumber;
import static ua.com.vendigo.knutimetable.utils.Validator.notEmpty;
import static ua.com.vendigo.knutimetable.utils.Validator.notNull;

/**
 * Flat View for {@link ua.com.vendigo.knutimetable.domain.timetable.TimeTable}.
 * Contains only text values of required fields.
 */
public class FlatTimeTable {
    private final String groupName;
    private final int courseNumber;
    private final Map<DayOfWeek, Map<Integer, FlatPair>> pairs;

    public FlatTimeTable(String groupName, int courseNumber, Map<DayOfWeek, Map<Integer, FlatPair>> pairs) {
        this.groupName = notEmpty(groupName, "groupName");
        this.courseNumber = isValidCourseNumber(courseNumber, "courseNumber");
        this.pairs = notNull(pairs, "pairs");
    }

    public String getGroupName() {
        return groupName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public Map<DayOfWeek, Map<Integer, FlatPair>> getPairs() {
        return pairs;
    }
}

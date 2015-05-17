package ua.com.vendigo.knutimetable.timetable;

import ua.com.vendigo.knutimetable.pair.SimplePair;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

import static ua.com.vendigo.knutimetable.util.Validator.*;

public class TimeTable {
    private final int courseNumber;
    private final String groupName;
    private final String groupDepartment;
    private final Map<DayOfWeek, Map<Integer, List<SimplePair>>> days;

    public TimeTable(int courseNumber, String groupName, String groupDepartment, Map<DayOfWeek, Map<Integer, List<SimplePair>>> days) {
        this.courseNumber = isPositive(courseNumber, "courseNumber");
        this.groupName = notEmpty(groupName, "groupName");
        this.groupDepartment = groupDepartment;
        this.days = notNull(days, "days");
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDepartment() {
        return groupDepartment;
    }

    public Map<DayOfWeek, Map<Integer, List<SimplePair>>> getDays() {
        return days;
    }
}

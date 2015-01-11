package ua.com.vendigo.knurozklad.domain.timetable;

import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.faculty.Group;
import ua.com.vendigo.knurozklad.domain.time.TimeSettings;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents timetable for specific group for specific semester.
 */
public class TimeTable {
    private final Integer id;
    private final Group group;
    private final TimeSettings timeSettings;
    private final List<Day> days;
    private final int year;
    private final int semester;
    private final Faculty faculty;

    public TimeTable(Integer id, Group group, TimeSettings timeSettings, List<Day> days, int year, int semester, Faculty faculty) {
        this.id = id;
        this.group = group;
        this.timeSettings = timeSettings;
        this.days = days;
        this.year = year;
        this.semester = semester;
        this.faculty = faculty;
    }

    public Integer getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public TimeSettings getTimeSettings() {
        return timeSettings;
    }

    public List<Day> getDays() {
        return days;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeTable timeTable = (TimeTable) o;

        if (semester != timeTable.semester) return false;
        if (year != timeTable.year) return false;
        if (days != null ? !days.equals(timeTable.days) : timeTable.days != null) return false;
        if (faculty != null ? !faculty.equals(timeTable.faculty) : timeTable.faculty != null) return false;
        if (group != null ? !group.equals(timeTable.group) : timeTable.group != null) return false;
        if (id != null ? !id.equals(timeTable.id) : timeTable.id != null) return false;
        if (timeSettings != null ? !timeSettings.equals(timeTable.timeSettings) : timeTable.timeSettings != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (timeSettings != null ? timeSettings.hashCode() : 0);
        result = 31 * result + (days != null ? days.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + semester;
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "id=" + id +
                ", group=" + group +
                ", timeSettings=" + timeSettings +
                ", days=" + days +
                ", year=" + year +
                ", semester=" + semester +
                ", faculty=" + faculty +
                '}';
    }
}

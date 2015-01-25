package ua.com.vendigo.knurozklad.domain.timetable;

import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.faculty.Group;
import ua.com.vendigo.knurozklad.domain.time.TimeSettings;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents timetable for specific group for specific semester.
 */
@Entity
@Table(name = "time_tables")
public class TimeTable {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Group group;
    @ManyToOne
    private TimeSettings timeSettings;
    @OneToMany
    @JoinColumn(name = "TIMETABLE_ID")
    private List<Day> days;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private int semester;
    @ManyToOne
    private Faculty faculty;

    public TimeTable() {
    }

    public TimeTable(Group group, TimeSettings timeSettings, List<Day> days, int year, int semester, Faculty faculty) {
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
}

package ua.com.vendigo.knutimetable.domain.faculty;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one university group (e.g. 1st year 1st group of Mathematics)
 */
@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private int courseNumber;
    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = true)
    private Department department;

    public Group() {
    }

    public Group(int courseNumber, String name, Department department) {
        this.courseNumber = courseNumber;
        this.name = name;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

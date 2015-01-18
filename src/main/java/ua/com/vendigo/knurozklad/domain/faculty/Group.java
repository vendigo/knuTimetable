package ua.com.vendigo.knurozklad.domain.faculty;

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
    @Column(name = "courseNumber", nullable = false)
    private int courseNumber;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "facultyId", nullable = false)
    private int facultyId;
    @ManyToOne
    @JoinColumn(name = "departmentId", nullable = false)
    private Department department;

    public Group(Integer id, int courseNumber, String name, int facultyId, Department department) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.name = name;
        this.facultyId = facultyId;
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

    public int getFacultyId() {
        return facultyId;
    }

    public Department getDepartment() {
        return department;
    }

}

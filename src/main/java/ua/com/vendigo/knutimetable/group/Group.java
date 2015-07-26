package ua.com.vendigo.knutimetable.group;

import org.springframework.data.rest.core.annotation.RestResource;
import ua.com.vendigo.knutimetable.faculty.Faculty;

import javax.persistence.*;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne()
    @RestResource(exported = false)
    private Faculty faculty;
    @Column(nullable = false)
    private int courseNumber;
    @Column(nullable = false)
    private String name;
    @Column
    private String department;
    @Column
    private String description;

    public Group() {
    }

    public Group(Integer id, Faculty faculty, int courseNumber, String name, String department, String description) {
        this.id = id;
        this.faculty = faculty;
        this.courseNumber = courseNumber;
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (courseNumber != group.courseNumber) return false;
        if (department != null ? !department.equals(group.department) : group.department != null) return false;
        if (description != null ? !description.equals(group.description) : group.description != null) return false;
        if (faculty != null ? !faculty.equals(group.faculty) : group.faculty != null) return false;
        if (id != null ? !id.equals(group.id) : group.id != null) return false;
        if (name != null ? !name.equals(group.name) : group.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + courseNumber;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", faculty=" + faculty +
                ", courseNumber=" + courseNumber +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

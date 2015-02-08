package ua.com.vendigo.knutimetable.domain.faculty;


import javax.persistence.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Contains only general information and list of groups.
 */
@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column
    private String description;
    @OneToMany
    @JoinColumn(name = "FACULTY_ID")
    private List<Group> groups;
    @OneToMany()
    @JoinColumn(name = "FACULTY_ID")
    private List<Department> departments;

    public Faculty() {
    }

    public Faculty(String name, String description, List<Group> groups, List<Department> departments) {
        this.name = name;
        this.description = description;
        this.groups = groups;
        this.departments = departments;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Group> getGroups() {
        return Collections.unmodifiableList(groups);
    }

    public List<Department> getDepartments() {
        return Collections.unmodifiableList(departments);
    }
}

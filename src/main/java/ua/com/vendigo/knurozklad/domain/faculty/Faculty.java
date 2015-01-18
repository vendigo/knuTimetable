package ua.com.vendigo.knurozklad.domain.faculty;


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
    @Column(name = "id", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "group")
    private List<Group> groups;
    @OneToMany(mappedBy = "department")
    private List<Department> departments;

    public Faculty(Integer id, String name, String description, List<Group> groups, List<Department> departments) {
        this.id = id;
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

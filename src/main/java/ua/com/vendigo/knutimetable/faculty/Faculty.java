package ua.com.vendigo.knutimetable.faculty;

import ua.com.vendigo.knutimetable.group.Group;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

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
}

package ua.com.vendigo.knutimetable.group;

import ua.com.vendigo.knutimetable.pair.Pair;

import javax.persistence.*;
import java.util.List;

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
    @Column
    private String department;
    @Column
    private String description;
    @OneToMany
    @JoinColumn(name = "GROUP_ID")
    private List<Pair> pairs;

    public Integer getId() {
        return id;
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

    public List<Pair> getPairs() {
        return pairs;
    }
}

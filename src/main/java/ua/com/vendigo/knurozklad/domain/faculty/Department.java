package ua.com.vendigo.knurozklad.domain.faculty;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Represent one department inside some faculty. In Ukrainian "kadefra".
 */
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "facultyId")
    private int facultyId;

    public Department(Integer id, String name, String description, int facultyId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.facultyId = facultyId;
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

    public int getFacultyId() {
        return facultyId;
    }
}

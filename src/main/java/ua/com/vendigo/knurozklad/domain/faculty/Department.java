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
    @Column(nullable = false)
    private String name;
    @Column
    private String description;

    public Department() {
    }

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
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
}

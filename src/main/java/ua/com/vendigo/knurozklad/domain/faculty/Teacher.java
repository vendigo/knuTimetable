package ua.com.vendigo.knurozklad.domain.faculty;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column
    private String description;

    public Teacher() {
    }

    public Teacher(String name, String description) {
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

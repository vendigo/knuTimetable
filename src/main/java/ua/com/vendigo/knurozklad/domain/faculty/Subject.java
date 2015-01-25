package ua.com.vendigo.knurozklad.domain.faculty;

import ua.com.vendigo.knurozklad.domain.pair.ExamType;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Describes university subject, e.g. Algebra, Math analysis, etc.
 */
@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column
    private String shortName;
    @Column
    private String description;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExamType examType;

    public Subject() {
    }

    public Subject(String name, String shortName, String description, ExamType examType) {
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.examType = examType;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getDescription() {
        return description;
    }

    public ExamType getExamType() {
        return examType;
    }
}

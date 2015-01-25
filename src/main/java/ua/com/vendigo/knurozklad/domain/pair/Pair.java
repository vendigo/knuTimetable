package ua.com.vendigo.knurozklad.domain.pair;

import ua.com.vendigo.knurozklad.domain.faculty.Cabinet;
import ua.com.vendigo.knurozklad.domain.faculty.Subject;
import ua.com.vendigo.knurozklad.domain.faculty.Teacher;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one pair. Contains cabinet, subject, teacher.
 */
@Entity
@Table(name = "pairs")
public class Pair {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne(optional = false)
    private Subject subject;
    @ManyToOne(optional = false)
    private Cabinet cabinet;
    @ManyToOne(optional = false)
    private Teacher teacher;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PairType pairType;

    public Pair() {
    }

    public Pair(Subject subject, Cabinet cabinet, Teacher teacher, PairType pairType) {
        this.subject = subject;
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.pairType = pairType;
    }

    public Integer getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public PairType getPairType() {
        return pairType;
    }
}

package ua.com.vendigo.knutimetable.pair;

import org.springframework.data.rest.core.annotation.RestResource;
import ua.com.vendigo.knutimetable.group.Group;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Table(name = "pairs")
public class Pair {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne()
    @RestResource(exported = false)
    private Group group;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WeekStatus weekStatus;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @Column(nullable = false)
    private int numberOfPair;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PairType pairType;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExamType examType;

    @Column(nullable = false)
    private String teacher;

    @Column(nullable = false)
    private String cabinet;

    public Integer getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public int getNumberOfPair() {
        return numberOfPair;
    }

    public WeekStatus getWeekStatus() {
        return weekStatus;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public String getSubject() {
        return subject;
    }

    public PairType getPairType() {
        return pairType;
    }

    public ExamType getExamType() {
        return examType;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getCabinet() {
        return cabinet;
    }
}

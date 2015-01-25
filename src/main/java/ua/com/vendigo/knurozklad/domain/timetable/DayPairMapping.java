package ua.com.vendigo.knurozklad.domain.timetable;

import ua.com.vendigo.knurozklad.domain.pair.Pair;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Used for implements ManyToMany relations between {@link ua.com.vendigo.knurozklad.domain.timetable.Day} and {@link ua.com.vendigo.knurozklad.domain.pair.Pair}.
 */
@Entity
@Table(name = "day_pair_mapping")
public class DayPairMapping {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne()
    @JoinColumn(name = "DAY_ID")
    private Day day;
    @Column(nullable = false)
    private int numberOfPair;
    @ManyToOne
    private Pair pair;

    public DayPairMapping() {
    }

    public DayPairMapping(Day day, int numberOfPair, Pair pair) {
        this.day = day;
        this.numberOfPair = numberOfPair;
        this.pair = pair;
    }

    public Integer getId() {
        return id;
    }

    public Day getDay() {
        return day;
    }

    public int getNumberOfPair() {
        return numberOfPair;
    }

    public Pair getPair() {
        return pair;
    }
}

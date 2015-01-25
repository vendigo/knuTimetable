package ua.com.vendigo.knurozklad.domain.timetable;

import ua.com.vendigo.knurozklad.domain.pair.Pair;
import ua.com.vendigo.knurozklad.domain.time.DayOfWeek;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one day. Contains mapping: number of pair - list of pairs.
 */
@Entity
@Table(name = "days")
public class Day {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @OneToMany(mappedBy = "day")
    private List<DayPairMapping> dayPairMapping;

    public Day() {
    }

    public Day(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getId() {
        return id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Map<Integer, Pair> getPairs() {
        Map<Integer, Pair> pairs = new HashMap<>();
        for (DayPairMapping pairMapping : dayPairMapping) {
            pairs.put(pairMapping.getNumberOfPair(), pairMapping.getPair());
        }
        return pairs;
    }

    /**
     * Mutual object! For test purposes only. Should be deleted.
     *
     * @param dayPairMapping
     */
    public void setDayPairMapping(List<DayPairMapping> dayPairMapping) {
        this.dayPairMapping = dayPairMapping;
    }
}

package ua.com.vendigo.knutimetable.domain.timetable;

import ua.com.vendigo.knutimetable.domain.time.DayOfWeek;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany
    @JoinColumn(name = "DAY_ID")
    private List<DayPairMapping> dayPairMappingList;

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

    public List<DayPairMapping> getDayPairMappingList() {
        return dayPairMappingList;
    }
}

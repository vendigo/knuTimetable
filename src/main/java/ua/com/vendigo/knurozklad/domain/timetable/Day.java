package ua.com.vendigo.knurozklad.domain.timetable;

import ua.com.vendigo.knurozklad.domain.pair.Pair;
import ua.com.vendigo.knurozklad.domain.time.DayOfWeek;

import java.util.List;
import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one day. Contains mapping: number of pair - list of pairs.
 */
public class Day {
    private final Integer id;
    private final DayOfWeek dayOfWeek;
    private final Map<Integer, List<Pair>> pairs;

    public Day(Integer id, DayOfWeek dayOfWeek, Map<Integer, List<Pair>> pairs) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.pairs = pairs;
    }

    public Integer getId() {
        return id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Map<Integer, List<Pair>> getPairs() {
        return pairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Day day = (Day) o;

        if (dayOfWeek != day.dayOfWeek) return false;
        if (id != null ? !id.equals(day.id) : day.id != null) return false;
        if (pairs != null ? !pairs.equals(day.pairs) : day.pairs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dayOfWeek != null ? dayOfWeek.hashCode() : 0);
        result = 31 * result + (pairs != null ? pairs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Day{" +
                "id=" + id +
                ", dayOfWeek=" + dayOfWeek +
                ", pairs=" + pairs +
                '}';
    }
}

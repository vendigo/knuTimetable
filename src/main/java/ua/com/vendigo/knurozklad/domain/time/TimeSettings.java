package ua.com.vendigo.knurozklad.domain.time;

import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents time settings for some TimeTable.
 * When each lesson starts, when end, how long is break, etc...
 */
public class TimeSettings {
    private final Integer id;
    private final Map<Integer, PairTime> pairTimes;
    private final SimpleDate oddWeekDate;

    public TimeSettings(Integer id, Map<Integer, PairTime> pairTimes, SimpleDate oddWeekDate) {
        this.id = id;
        this.pairTimes = pairTimes;
        this.oddWeekDate = oddWeekDate;
    }

    public Integer getId() {
        return id;
    }

    public Map<Integer, PairTime> getPairTimes() {
        return pairTimes;
    }

    public SimpleDate getOddWeekDate() {
        return oddWeekDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeSettings that = (TimeSettings) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (oddWeekDate != null ? !oddWeekDate.equals(that.oddWeekDate) : that.oddWeekDate != null) return false;
        if (pairTimes != null ? !pairTimes.equals(that.pairTimes) : that.pairTimes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pairTimes != null ? pairTimes.hashCode() : 0);
        result = 31 * result + (oddWeekDate != null ? oddWeekDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TimeSettings{" +
                "id=" + id +
                ", pairTimes=" + pairTimes +
                ", oddWeekDate=" + oddWeekDate +
                '}';
    }
}

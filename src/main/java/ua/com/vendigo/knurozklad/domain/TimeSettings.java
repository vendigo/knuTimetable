package ua.com.vendigo.knurozklad.domain;

import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents time settings for some TimeTable.
 * When each lesson starts, when end, how long is break, etc...
 */
public class TimeSettings {
    private final Integer id;
    private final Map<Integer, PairTime> pairTimes;

    public TimeSettings(Integer id, Map<Integer, PairTime> pairTimes) {
        this.id = id;
        this.pairTimes = pairTimes;
    }

    public Integer getId() {
        return id;
    }

    public Map<Integer, PairTime> getPairTimes() {
        return pairTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeSettings that = (TimeSettings) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pairTimes != null ? !pairTimes.equals(that.pairTimes) : that.pairTimes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pairTimes != null ? pairTimes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TimeSettings{" +
                "id=" + id +
                ", pairTimes=" + pairTimes +
                '}';
    }
}

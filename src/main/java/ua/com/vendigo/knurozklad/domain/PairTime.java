package ua.com.vendigo.knurozklad.domain;


import org.joda.time.LocalTime;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Contains time settings for specific pair.
 */
public class PairTime {
    private final Integer id;
    private final LocalTime timeBegin;
    private final LocalTime timeBreak;
    private final LocalTime timeBreakEnd;
    private final LocalTime timeEnd;

    public PairTime(Integer id, LocalTime timeBegin, LocalTime timeBreak, LocalTime timeBreakEnd, LocalTime timeEnd) {
        this.id = id;
        this.timeBegin = timeBegin;
        this.timeBreak = timeBreak;
        this.timeBreakEnd = timeBreakEnd;
        this.timeEnd = timeEnd;
    }

    public Integer getId() {
        return id;
    }

    public LocalTime getTimeBegin() {
        return timeBegin;
    }

    public LocalTime getTimeBreak() {
        return timeBreak;
    }

    public LocalTime getTimeBreakEnd() {
        return timeBreakEnd;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairTime pairTime = (PairTime) o;

        if (id != null ? !id.equals(pairTime.id) : pairTime.id != null) return false;
        if (timeBegin != null ? !timeBegin.equals(pairTime.timeBegin) : pairTime.timeBegin != null) return false;
        if (timeBreak != null ? !timeBreak.equals(pairTime.timeBreak) : pairTime.timeBreak != null) return false;
        if (timeBreakEnd != null ? !timeBreakEnd.equals(pairTime.timeBreakEnd) : pairTime.timeBreakEnd != null)
            return false;
        if (timeEnd != null ? !timeEnd.equals(pairTime.timeEnd) : pairTime.timeEnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (timeBegin != null ? timeBegin.hashCode() : 0);
        result = 31 * result + (timeBreak != null ? timeBreak.hashCode() : 0);
        result = 31 * result + (timeBreakEnd != null ? timeBreakEnd.hashCode() : 0);
        result = 31 * result + (timeEnd != null ? timeEnd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PairTime{" +
                "id=" + id +
                ", timeBegin=" + timeBegin +
                ", timeBreak=" + timeBreak +
                ", timeBreakEnd=" + timeBreakEnd +
                ", timeEnd=" + timeEnd +
                '}';
    }
}

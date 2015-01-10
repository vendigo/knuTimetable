package ua.com.vendigo.knurozklad.domain;

import org.joda.time.LocalDate;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Used when in timetable appears additional pair.
 */
public class AdditionalPair {
    private final Integer id;
    private final LocalDate date;
    private final Group group;
    private final int pairNumber;
    private final Pair pair;
    private final String description;

    public AdditionalPair(Integer id, LocalDate date, Group group, int pairNumber, Pair pair, String description) {
        this.id = id;
        this.date = date;
        this.group = group;
        this.pairNumber = pairNumber;
        this.pair = pair;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Group getGroup() {
        return group;
    }

    public int getPairNumber() {
        return pairNumber;
    }

    public Pair getPair() {
        return pair;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdditionalPair that = (AdditionalPair) o;

        if (pairNumber != that.pairNumber) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (group != null ? !group.equals(that.group) : that.group != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pair != null ? !pair.equals(that.pair) : that.pair != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + pairNumber;
        result = 31 * result + (pair != null ? pair.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdditionalPair{" +
                "id=" + id +
                ", date=" + date +
                ", group=" + group +
                ", pairNumber=" + pairNumber +
                ", pair=" + pair +
                ", description='" + description + '\'' +
                '}';
    }
}

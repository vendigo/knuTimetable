package ua.com.vendigo.knutimetable.domain.timetable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.joda.ser.LocalDateSerializer;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents canceled pair in some TimeTable.
 */
@Entity
@Table(name = "canceled_pairs")
public class CanceledPair {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate date;

    @ManyToOne(optional = false)
    private TimeTable timeTable;

    @Column(nullable = false)
    private int pairNumber;

    @Column(nullable = false)
    private String description;

    public CanceledPair() {
    }

    public CanceledPair(LocalDate date, TimeTable timeTable, int pairNumber, String description) {
        this.date = date;
        this.timeTable = timeTable;
        this.pairNumber = pairNumber;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public int getPairNumber() {
        return pairNumber;
    }

    public String getDescription() {
        return description;
    }
}

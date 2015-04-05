package ua.com.vendigo.knutimetable.domain.time;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.joda.ser.LocalTimeSerializer;
import org.hibernate.annotations.Type;
import org.joda.time.LocalTime;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Contains time settings for specific pair.
 */
@Entity
@Table(name = "pair_times")
public class PairTime {
    @Id
    @GeneratedValue
    private Integer id;
    private int pairNumber;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
    private LocalTime timeBegin;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
    private LocalTime timeBreak;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
    private LocalTime timeBreakEnd;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
    private LocalTime timeEnd;

    public PairTime() {
    }


    public PairTime(int pairNumber, LocalTime timeBegin, LocalTime timeBreak, LocalTime timeBreakEnd, LocalTime timeEnd) {
        this.pairNumber = pairNumber;
        this.timeBegin = timeBegin;
        this.timeBreak = timeBreak;
        this.timeBreakEnd = timeBreakEnd;
        this.timeEnd = timeEnd;
    }

    public int getPairNumber() {
        return pairNumber;
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
}

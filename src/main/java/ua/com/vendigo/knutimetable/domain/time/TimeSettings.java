package ua.com.vendigo.knutimetable.domain.time;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.joda.ser.LocalDateSerializer;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents time settings for some TimeTable.
 * When each lesson starts, when end, how long is break, etc...
 */
@Entity
@Table(name = "time_settings")
public class TimeSettings {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany
    @JoinColumn(name = "TIME_SETTINGS_ID")
    @MapKey(name = "pairNumber")
    private Map<Integer, PairTime> pairTimes;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate oddWeekDate;

    public TimeSettings() {
    }

    public TimeSettings(Map<Integer, PairTime> pairTimes, LocalDate oddWeekDate) {
        this.pairTimes = pairTimes;
        this.oddWeekDate = oddWeekDate;
    }

    public Map<Integer, PairTime> getPairTimes() {
        return pairTimes;
    }

    public LocalDate getOddWeekDate() {
        return oddWeekDate;
    }
}

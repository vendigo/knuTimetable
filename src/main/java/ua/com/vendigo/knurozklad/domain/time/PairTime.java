package ua.com.vendigo.knurozklad.domain.time;


import org.joda.time.LocalDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Contains time settings for specific pair.
 */
@Entity
@Table(name = "pairtimes")
public class PairTime {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private LocalDate timeBegin;
    @Column(nullable = false)
    private LocalDate timeBreak;
    @Column(nullable = false)
    private java.sql.Date timeBreakEnd;
    @Column(nullable = false)
    private java.util.Date timeEnd;

    public PairTime() {
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getTimeBegin() {
        return timeBegin;
    }

    public LocalDate getTimeBreak() {
        return timeBreak;
    }

    public java.sql.Date getTimeBreakEnd() {
        return timeBreakEnd;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }
}

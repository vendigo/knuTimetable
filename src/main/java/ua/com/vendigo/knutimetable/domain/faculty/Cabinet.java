package ua.com.vendigo.knutimetable.domain.faculty;

import javax.persistence.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one cabinet.
 */
@Entity
@Table(name = "cabinets")
public class Cabinet {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String number;
    @Column
    private String description;

    public Cabinet() {
    }

    public Cabinet(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}

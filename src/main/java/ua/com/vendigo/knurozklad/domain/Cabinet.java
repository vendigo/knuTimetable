package ua.com.vendigo.knurozklad.domain;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
public class Cabinet {
    private final Integer id;
    private final String number;
    private final String description;

    public Cabinet(Integer id, String number, String description) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cabinet cabinet = (Cabinet) o;

        if (description != null ? !description.equals(cabinet.description) : cabinet.description != null) return false;
        if (id != null ? !id.equals(cabinet.id) : cabinet.id != null) return false;
        if (number != null ? !number.equals(cabinet.number) : cabinet.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

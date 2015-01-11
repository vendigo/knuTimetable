package ua.com.vendigo.knurozklad.domain.faculty;

import ua.com.vendigo.knurozklad.domain.pair.ExamType;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Describes university subject, e.g. Algebra, Math analysis, etc.
 */
public class Subject {
    private final Integer id;
    private final String name;
    private final String shortName;
    private final String description;
    private final ExamType examType;

    public Subject(Integer id, String name, String shortName, String description, ExamType examType) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.examType = examType;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getDescription() {
        return description;
    }

    public ExamType getExamType() {
        return examType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        if (description != null ? !description.equals(subject.description) : subject.description != null) return false;
        if (examType != subject.examType) return false;
        if (id != null ? !id.equals(subject.id) : subject.id != null) return false;
        if (name != null ? !name.equals(subject.name) : subject.name != null) return false;
        if (shortName != null ? !shortName.equals(subject.shortName) : subject.shortName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (examType != null ? examType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", description='" + description + '\'' +
                ", examType=" + examType +
                '}';
    }
}

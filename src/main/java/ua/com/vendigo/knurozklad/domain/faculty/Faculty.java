package ua.com.vendigo.knurozklad.domain.faculty;

import java.util.Collections;
import java.util.List;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 * Contains only general information and list of groups.
 */
public class Faculty {
    private final Integer id;
    private final String name;
    private final String description;
    private final List<Group> groups;
    private final List<Department> departments;

    public Faculty(Integer id, String name, String description, List<Group> groups, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groups = groups;
        this.departments = departments;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Group> getGroups() {
        return Collections.unmodifiableList(groups);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (departments != null ? !departments.equals(faculty.departments) : faculty.departments != null) return false;
        if (description != null ? !description.equals(faculty.description) : faculty.description != null) return false;
        if (groups != null ? !groups.equals(faculty.groups) : faculty.groups != null) return false;
        if (id != null ? !id.equals(faculty.id) : faculty.id != null) return false;
        if (name != null ? !name.equals(faculty.name) : faculty.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (departments != null ? departments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groups=" + groups +
                ", departments=" + departments +
                '}';
    }
}

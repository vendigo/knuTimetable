package ua.com.vendigo.knurozklad.domain;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one university group (e.g. 1st year 1st group of Mathematics)
 */
public class Group {
    private final Integer id;
    private final int courseNumber;
    private final String name;
    private final String department;

    public Group(Integer id, int courseNumber, String name, String department) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.name = name;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (courseNumber != group.courseNumber) return false;
        if (department != null ? !department.equals(group.department) : group.department != null) return false;
        if (id != null ? !id.equals(group.id) : group.id != null) return false;
        if (name != null ? !name.equals(group.name) : group.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + courseNumber;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", courseNumber=" + courseNumber +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

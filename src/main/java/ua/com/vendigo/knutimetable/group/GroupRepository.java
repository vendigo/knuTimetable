package ua.com.vendigo.knutimetable.group;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Integer> {
    List<Group> findByFaculty_Id(@Param("id") int facultyId);
}

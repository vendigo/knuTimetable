package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Group;

public interface GroupRepository extends PagingAndSortingRepository<Group, Integer> {
}

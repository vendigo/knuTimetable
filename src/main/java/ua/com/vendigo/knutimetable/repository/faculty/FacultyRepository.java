package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Faculty;

public interface FacultyRepository extends PagingAndSortingRepository<Faculty, Integer> {
}

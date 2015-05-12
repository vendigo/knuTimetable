package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Subject;

public interface SubjectRepository extends PagingAndSortingRepository<Subject, Integer> {
}

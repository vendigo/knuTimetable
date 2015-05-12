package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Teacher;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Integer> {
}

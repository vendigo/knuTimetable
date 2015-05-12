package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Integer> {
}

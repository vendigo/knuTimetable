package ua.com.vendigo.knutimetable.repository.faculty;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.faculty.Cabinet;

public interface CabinetRepository extends PagingAndSortingRepository<Cabinet, Integer> {
}

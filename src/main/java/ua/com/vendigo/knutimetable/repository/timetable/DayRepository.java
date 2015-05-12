package ua.com.vendigo.knutimetable.repository.timetable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.timetable.Day;

public interface DayRepository extends PagingAndSortingRepository<Day, Integer> {
}

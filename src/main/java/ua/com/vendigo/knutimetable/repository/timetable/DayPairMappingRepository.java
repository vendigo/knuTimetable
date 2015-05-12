package ua.com.vendigo.knutimetable.repository.timetable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.timetable.DayPairMapping;

public interface DayPairMappingRepository extends PagingAndSortingRepository<DayPairMapping, Integer> {
}

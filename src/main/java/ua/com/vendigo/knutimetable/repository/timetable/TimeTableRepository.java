package ua.com.vendigo.knutimetable.repository.timetable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

public interface TimeTableRepository extends PagingAndSortingRepository<TimeTable, Integer> {
    TimeTable findByGroup_IdAndYear(int groupId, int year);
}

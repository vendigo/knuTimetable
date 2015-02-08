package ua.com.vendigo.knutimetable.repository.timetable;

import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.repository.GenericRepository;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Repository interface for Spring-Data-JPA. Implementation will be created in runtime.
 */
public interface TimeTableRepository extends GenericRepository<TimeTable, Integer> {
    TimeTable findByGroup_IdAndYear(int groupId, int year);
}

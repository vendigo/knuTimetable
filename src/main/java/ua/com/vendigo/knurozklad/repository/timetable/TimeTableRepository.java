package ua.com.vendigo.knurozklad.repository.timetable;

import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
import ua.com.vendigo.knurozklad.repository.GenericRepository;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Repository interface for Spring-Data-JPA. Implementation will be created in runtime.
 */
public interface TimeTableRepository extends GenericRepository<TimeTable, Integer> {
}

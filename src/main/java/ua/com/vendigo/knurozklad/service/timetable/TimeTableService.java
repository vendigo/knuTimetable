package ua.com.vendigo.knurozklad.service.timetable;

import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
public interface TimeTableService {
    TimeTable saveTimeTable(TimeTable timeTable);

    List<TimeTable> findAllTimeTables();
}

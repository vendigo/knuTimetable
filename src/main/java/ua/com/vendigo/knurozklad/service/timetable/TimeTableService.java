package ua.com.vendigo.knurozklad.service.timetable;

import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
public interface TimeTableService {
    TimeTable getActualTimeTableForGroup(int groupId);
}

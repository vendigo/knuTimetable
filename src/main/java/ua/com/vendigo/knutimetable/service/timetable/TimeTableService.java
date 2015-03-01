package ua.com.vendigo.knutimetable.service.timetable;

import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.service.GenericService;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
public interface TimeTableService extends GenericService<TimeTable, Integer> {
    TimeTable getActualTimeTableForGroup(Integer groupId);
}

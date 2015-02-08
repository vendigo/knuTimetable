package ua.com.vendigo.knutimetable.service.timetable;

import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
public interface TimeTableService {
    TimeTable getActualTimeTableForGroup(int groupId);
}

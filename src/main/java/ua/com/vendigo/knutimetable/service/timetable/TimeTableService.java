package ua.com.vendigo.knutimetable.service.timetable;

import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.SnapshotTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.service.GenericService;

public interface TimeTableService extends GenericService<TimeTable, Integer> {
    TimeTable getFullTimeTableForGroup(Integer groupId);
    FlatTimeTable getFlatTimeTableForGroup(Integer groupId);
    SnapshotTimeTable getSnapshotTimeTableForGroup(Integer groupId);
}

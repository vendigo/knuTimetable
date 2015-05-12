package ua.com.vendigo.knutimetable.service;

import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.SnapshotTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

public interface TimeTableService {
    TimeTable getFullTimeTableForGroup(Integer groupId);
    FlatTimeTable getFlatTimeTableForGroup(Integer groupId);
    SnapshotTimeTable getSnapshotTimeTableForGroup(Integer groupId);
}

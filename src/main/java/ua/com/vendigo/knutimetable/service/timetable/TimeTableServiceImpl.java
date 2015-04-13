package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.SnapshotTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.repository.timetable.TimeTableRepository;
import utils.FlatTimeTableCreator;
import utils.SnapshotTimeTableCreator;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;
import java.util.List;

@Component("timeTableService")
public class TimeTableServiceImpl implements TimeTableService {

    private final EnumSet<Month> firstTerm = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
    @Autowired
    TimeTableRepository timeTableRepository;
    @Autowired
    FlatTimeTableCreator flatTimeTableCreator;
    @Autowired
    SnapshotTimeTableCreator snapshotTimeTableCreator;

    @Override
    public TimeTable getFullTimeTableForGroup(Integer groupId) {
        //Define correct value for year
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        Month month = currentDate.getMonth();
        if (!firstTerm.contains(month)) {
            year--;
        }
        return timeTableRepository.findByGroup_IdAndYear(groupId, year);
    }

    @Override
    public FlatTimeTable getFlatTimeTableForGroup(Integer groupId) {
        return FlatTimeTableCreator.createFlatTimeTable(getFullTimeTableForGroup(groupId));
    }

    @Override
    public SnapshotTimeTable getSnapshotTimeTableForGroup(Integer groupId) {
        return SnapshotTimeTableCreator.createSnapshotTimeTable(getFullTimeTableForGroup(groupId));
    }

    @Override
    public List<TimeTable> findAll() {
        return timeTableRepository.findAll();
    }

    @Override
    public TimeTable findOne(Integer timeTableId) {
        return timeTableRepository.findOne(timeTableId);
    }

    @Override
    public <S extends TimeTable> S save(S timeTable) {
        return timeTableRepository.save(timeTable);
    }

    @Override
    public void delete(Integer timeTableId) {
        timeTableRepository.delete(timeTableId);
    }
}

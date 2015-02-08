package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.repository.timetable.TimeTableRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
@Component("timeTableService")
public class TimeTableServiceImpl implements TimeTableService {

    @Autowired
    TimeTableRepository timeTableRepository;

    private final EnumSet<Month> firstTerm = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);

    @Override
    public TimeTable getActualTimeTableForGroup(int groupId) {
        //Define correct value for year
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        Month month = currentDate.getMonth();
        if (!firstTerm.contains(month)) {
            year--;
        }

        return timeTableRepository.findByGroup_IdAndYear(groupId, year);
    }
}

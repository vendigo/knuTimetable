package ua.com.vendigo.knurozklad.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
import ua.com.vendigo.knurozklad.repository.timetable.TimeTableRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 */
@Component("timeTableService")
public class TimeTableServiceImpl implements TimeTableService {

    @Autowired
    TimeTableRepository timeTableRepository;

    @Override
    public TimeTable saveTimeTable(TimeTable timeTable) {
        return timeTableRepository.save(timeTable);
    }

    @Override
    public List<TimeTable> findAllTimeTables() {
        return timeTableRepository.findAll();
    }
}

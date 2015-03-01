package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.Day;
import ua.com.vendigo.knutimetable.repository.timetable.DayRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("dayService")
public class DayServiceImpl implements DayService {

    @Autowired
    DayRepository dayRepository;

    @Override
    public List<Day> findAll() {
        return dayRepository.findAll();
    }

    @Override
    public Day findOne(Integer dayId) {
        return dayRepository.findOne(dayId);
    }

    @Override
    public <S extends Day> S save(S day) {
        return dayRepository.save(day);
    }

    @Override
    public void delete(Integer dayId) {
        dayRepository.delete(dayId);
    }
}

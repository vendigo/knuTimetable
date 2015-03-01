package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.DayPairMapping;
import ua.com.vendigo.knutimetable.repository.timetable.DayPairMappingRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("dayPairMappingComponent")
public class DayPairMappingServiceImpl implements DayPairMappingService {

    @Autowired
    DayPairMappingRepository dayPairMappingRepository;

    @Override
    public List<DayPairMapping> findAll() {
        return dayPairMappingRepository.findAll();
    }

    @Override
    public DayPairMapping findOne(Integer dayPairMappingId) {
        return dayPairMappingRepository.findOne(dayPairMappingId);
    }

    @Override
    public <S extends DayPairMapping> S save(S dayPairMapping) {
        return dayPairMappingRepository.save(dayPairMapping);
    }

    @Override
    public void delete(Integer dayPairMappingId) {
        dayPairMappingRepository.delete(dayPairMappingId);
    }
}

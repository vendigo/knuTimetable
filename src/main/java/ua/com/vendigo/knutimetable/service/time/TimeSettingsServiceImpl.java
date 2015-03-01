package ua.com.vendigo.knutimetable.service.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.time.TimeSettings;
import ua.com.vendigo.knutimetable.repository.time.TimeSettingsRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("timeSettingsService")
public class TimeSettingsServiceImpl implements TimeSettingsService {

    @Autowired
    TimeSettingsRepository timeSettingsRepository;

    @Override
    public List<TimeSettings> findAll() {
        return timeSettingsRepository.findAll();
    }

    @Override
    public TimeSettings findOne(Integer timeSettingsId) {
        return timeSettingsRepository.findOne(timeSettingsId);
    }

    @Override
    public <S extends TimeSettings> S save(S timeSettings) {
        return timeSettingsRepository.save(timeSettings);
    }

    @Override
    public void delete(Integer timeSettingsId) {
        timeSettingsRepository.delete(timeSettingsId);
    }
}

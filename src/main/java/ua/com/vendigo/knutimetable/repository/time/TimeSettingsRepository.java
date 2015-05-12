package ua.com.vendigo.knutimetable.repository.time;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.time.TimeSettings;

public interface TimeSettingsRepository extends PagingAndSortingRepository<TimeSettings, Integer> {
}

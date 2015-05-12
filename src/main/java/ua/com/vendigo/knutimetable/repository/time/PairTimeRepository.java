package ua.com.vendigo.knutimetable.repository.time;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.time.PairTime;

public interface PairTimeRepository extends PagingAndSortingRepository<PairTime, Integer> {
}

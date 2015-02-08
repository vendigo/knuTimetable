package ua.com.vendigo.knutimetable.repository.time;

import ua.com.vendigo.knutimetable.domain.time.PairTime;
import ua.com.vendigo.knutimetable.repository.GenericRepository;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Repository interface for Spring-Data-JPA. Implementation will be created in runtime.
 */
public interface PairTimeRepository extends GenericRepository<PairTime, Integer> {
}

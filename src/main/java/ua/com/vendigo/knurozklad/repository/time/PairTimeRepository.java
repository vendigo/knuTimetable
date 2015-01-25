package ua.com.vendigo.knurozklad.repository.time;

import ua.com.vendigo.knurozklad.domain.time.PairTime;
import ua.com.vendigo.knurozklad.repository.GenericRepository;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Repository interface for Spring-Data-JPA. Implementation will be created in runtime.
 */
public interface PairTimeRepository extends GenericRepository<PairTime, Integer> {
}

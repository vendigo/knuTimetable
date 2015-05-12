package ua.com.vendigo.knutimetable.repository.timetable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.timetable.CanceledPair;

public interface CanceledPairRepository extends PagingAndSortingRepository<CanceledPair, Integer> {
}

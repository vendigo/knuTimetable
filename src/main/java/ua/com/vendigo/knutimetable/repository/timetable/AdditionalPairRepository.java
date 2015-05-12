package ua.com.vendigo.knutimetable.repository.timetable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.timetable.AdditionalPair;

public interface AdditionalPairRepository extends PagingAndSortingRepository<AdditionalPair, Integer> {
}

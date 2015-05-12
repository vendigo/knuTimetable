package ua.com.vendigo.knutimetable.repository.pair;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.vendigo.knutimetable.domain.pair.Pair;

public interface PairRepository extends PagingAndSortingRepository<Pair, Integer> {
}

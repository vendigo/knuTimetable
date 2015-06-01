package ua.com.vendigo.knutimetable.pair;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PairRepository extends CrudRepository<Pair, Integer> {
    List<Pair> findByGroup_Id(@Param("id") int groupId);
}

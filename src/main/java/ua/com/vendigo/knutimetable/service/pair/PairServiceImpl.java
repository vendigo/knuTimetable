package ua.com.vendigo.knutimetable.service.pair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.pair.Pair;
import ua.com.vendigo.knutimetable.repository.pair.PairRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("pairService")
public class PairServiceImpl implements PairService {

    @Autowired
    PairRepository pairRepository;

    @Override
    public List<Pair> findAll() {
        return pairRepository.findAll();
    }

    @Override
    public Pair findOne(Integer pairId) {
        return pairRepository.findOne(pairId);
    }

    @Override
    public <S extends Pair> S save(S pair) {
        return pairRepository.save(pair);
    }

    @Override
    public void delete(Integer pairId) {
        pairRepository.delete(pairId);
    }
}

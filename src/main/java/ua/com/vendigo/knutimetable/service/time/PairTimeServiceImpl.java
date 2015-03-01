package ua.com.vendigo.knutimetable.service.time;

import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.time.PairTime;
import ua.com.vendigo.knutimetable.repository.time.PairTimeRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("pairTimeService")
public class PairTimeServiceImpl implements PairTimeService {

    PairTimeRepository pairTimeRepository;

    @Override
    public List<PairTime> findAll() {
        return pairTimeRepository.findAll();
    }

    @Override
    public PairTime findOne(Integer pairTimeId) {
        return pairTimeRepository.findOne(pairTimeId);
    }

    @Override
    public <S extends PairTime> S save(S pairTime) {
        return pairTimeRepository.save(pairTime);
    }

    @Override
    public void delete(Integer pairTimeId) {
        pairTimeRepository.delete(pairTimeId);
    }
}

package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.CanceledPair;
import ua.com.vendigo.knutimetable.repository.timetable.CanceledPairRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("canceledService")
public class CanceledPairServiceImpl implements CanceledPairService {

    @Autowired
    CanceledPairRepository canceledPairRepository;

    @Override
    public List<CanceledPair> findAll() {
        return canceledPairRepository.findAll();
    }

    @Override
    public CanceledPair findOne(Integer canseledPairId) {
        return canceledPairRepository.findOne(canseledPairId);
    }

    @Override
    public <S extends CanceledPair> S save(S canceledPair) {
        return canceledPairRepository.save(canceledPair);
    }

    @Override
    public void delete(Integer canceledPairId) {
        canceledPairRepository.delete(canceledPairId);
    }
}

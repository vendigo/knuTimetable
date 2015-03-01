package ua.com.vendigo.knutimetable.service.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.timetable.AdditionalPair;
import ua.com.vendigo.knutimetable.repository.timetable.AdditionalPairRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("additionalPairService")
public class AdditionalPairServiceImpl implements AdditionalPairService {

    @Autowired
    AdditionalPairRepository additionalPairRepository;

    @Override
    public List<AdditionalPair> findAll() {
        return additionalPairRepository.findAll();
    }

    @Override
    public AdditionalPair findOne(Integer additionalPairId) {
        return additionalPairRepository.findOne(additionalPairId);
    }

    @Override
    public <S extends AdditionalPair> S save(S additionalPair) {
        return additionalPairRepository.save(additionalPair);
    }

    @Override
    public void delete(Integer additionalPairId) {
        additionalPairRepository.delete(additionalPairId);
    }
}

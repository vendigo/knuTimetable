package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Cabinet;
import ua.com.vendigo.knutimetable.repository.faculty.CabinetRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("cabinetService")
public class CabinetServiceImpl implements CabinetService {

    @Autowired
    CabinetRepository cabinetRepository;

    @Override
    public List<Cabinet> findAll() {
        return cabinetRepository.findAll();
    }

    @Override
    public Cabinet findOne(Integer cabinetId) {
        return cabinetRepository.findOne(cabinetId);
    }

    @Override
    public <S extends Cabinet> S save(S cabinet) {
        return cabinetRepository.save(cabinet);
    }

    @Override
    public void delete(Integer cabinetId) {
        cabinetRepository.delete(cabinetId);
    }
}

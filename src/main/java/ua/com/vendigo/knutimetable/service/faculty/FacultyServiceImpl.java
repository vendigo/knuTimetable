package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Faculty;
import ua.com.vendigo.knutimetable.repository.faculty.FacultyRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 08.02.2015.
 */
@Component("facultyService")
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty findOne(Integer facultyId) {
        return facultyRepository.findOne(facultyId);
    }

    @Override
    public <S extends Faculty> S save(S faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public void delete(Integer facultyId) {
        facultyRepository.delete(facultyId);
    }
}

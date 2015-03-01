package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Subject;
import ua.com.vendigo.knutimetable.repository.faculty.SubjectRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject findOne(Integer subjectId) {
        return subjectRepository.findOne(subjectId);
    }

    @Override
    public <S extends Subject> S save(S subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(Integer subjectId) {
        subjectRepository.delete(subjectId);
    }
}

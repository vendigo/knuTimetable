package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Teacher;
import ua.com.vendigo.knutimetable.repository.faculty.TeacherRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
@Component("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findOne(Integer teacherId) {
        return teacherRepository.findOne(teacherId);
    }

    @Override
    public <S extends Teacher> S save(S teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void delete(Integer teacherId) {
        teacherRepository.delete(teacherId);
    }
}

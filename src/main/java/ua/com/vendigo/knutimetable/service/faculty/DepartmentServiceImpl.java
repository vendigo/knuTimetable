package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Department;
import ua.com.vendigo.knutimetable.repository.faculty.DepartmentRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 08.02.2015.
 */
@Component("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findOne(Integer departmentId) {
        return departmentRepository.findOne(departmentId);
    }

    @Override
    public <S extends Department> S save(S department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Integer departmentId) {
        departmentRepository.delete(departmentId);
    }
}

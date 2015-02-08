package ua.com.vendigo.knurozklad.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knurozklad.domain.faculty.Department;
import ua.com.vendigo.knurozklad.repository.faculty.DepartmentRepository;

/**
 * Created by Dmytro Marchenko on 08.02.2015.
 */
@Component("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department getDepartmentById(int departmentId) {
        return departmentRepository.findOne(departmentId);
    }
}

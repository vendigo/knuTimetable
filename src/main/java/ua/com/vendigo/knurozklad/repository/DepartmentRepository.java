package ua.com.vendigo.knurozklad.repository;

import org.springframework.data.repository.Repository;
import ua.com.vendigo.knurozklad.domain.faculty.Department;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface DepartmentRepository extends Repository<Department, Integer> {
    Department save(Department department);

    List<Department> findAll();
}

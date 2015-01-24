package ua.com.vendigo.knurozklad.repository;

import ua.com.vendigo.knurozklad.domain.faculty.Department;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface DepartmentRepository extends GenericRepository<Department, Integer> {
    List<Department> findAll();
}

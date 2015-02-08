package ua.com.vendigo.knutimetable.service.faculty;

import ua.com.vendigo.knutimetable.domain.faculty.Department;

/**
 * Created by Dmytro Marchenko on 08.02.2015.
 */
public interface DepartmentService {
    Department getDepartmentById(int departmentId);
}

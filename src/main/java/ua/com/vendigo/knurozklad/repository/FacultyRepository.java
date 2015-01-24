package ua.com.vendigo.knurozklad.repository;

import ua.com.vendigo.knurozklad.domain.faculty.Faculty;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface FacultyRepository extends GenericRepository<Faculty, Integer> {
    List<Faculty> findAll();
}

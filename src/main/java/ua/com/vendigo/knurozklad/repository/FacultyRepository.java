package ua.com.vendigo.knurozklad.repository;

import org.springframework.data.repository.Repository;
import ua.com.vendigo.knurozklad.domain.faculty.Faculty;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface FacultyRepository extends Repository<Faculty, Integer> {
    Faculty save(Faculty faculty);

    List<Faculty> findAll();
}

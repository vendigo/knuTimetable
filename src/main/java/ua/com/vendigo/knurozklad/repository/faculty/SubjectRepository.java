package ua.com.vendigo.knurozklad.repository.faculty;

import ua.com.vendigo.knurozklad.domain.faculty.Subject;
import ua.com.vendigo.knurozklad.repository.GenericRepository;

/**
 * Created by Dmytro Marchenko on 25.01.2015.
 * Repository interface for Spring-Data-JPA. Implementation will be created in runtime.
 */
public interface SubjectRepository extends GenericRepository<Subject, Integer> {
}

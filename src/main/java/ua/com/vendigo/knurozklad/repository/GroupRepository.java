package ua.com.vendigo.knurozklad.repository;

import org.springframework.data.repository.Repository;
import ua.com.vendigo.knurozklad.domain.faculty.Group;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface GroupRepository extends Repository<Group, Integer> {
    Group save(Group group);

    List<Group> findAll();
}

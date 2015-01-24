package ua.com.vendigo.knurozklad.repository;

import ua.com.vendigo.knurozklad.domain.faculty.Group;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 18.01.2015.
 */
public interface GroupRepository extends GenericRepository<Group, Integer> {
    List<Group> findAll();
}

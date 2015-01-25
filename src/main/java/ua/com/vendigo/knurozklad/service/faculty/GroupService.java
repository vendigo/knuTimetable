package ua.com.vendigo.knurozklad.service.faculty;

import ua.com.vendigo.knurozklad.domain.faculty.Group;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 24.01.2015.
 */
public interface GroupService {
    List<Group> findAllGroups();
}

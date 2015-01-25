package ua.com.vendigo.knurozklad.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knurozklad.domain.faculty.Group;
import ua.com.vendigo.knurozklad.repository.faculty.GroupRepository;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 24.01.2015.
 * Service for groups. Used in controllers.
 */
@Component("groupService")
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public List<Group> findAllGroups() {
        return groupRepository.findAll();
    }
}

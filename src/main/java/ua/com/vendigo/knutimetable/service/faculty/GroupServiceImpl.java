package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Group;
import ua.com.vendigo.knutimetable.repository.faculty.GroupRepository;

/**
 * Created by Dmytro Marchenko on 24.01.2015.
 * Service for groups. Used in controllers.
 */
@Component("groupService")
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Override
    public Group getGroupById(int groupId) {
        return groupRepository.findOne(groupId);
    }
}

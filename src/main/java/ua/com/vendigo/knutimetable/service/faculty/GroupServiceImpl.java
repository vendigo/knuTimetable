package ua.com.vendigo.knutimetable.service.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.domain.faculty.Group;
import ua.com.vendigo.knutimetable.repository.faculty.GroupRepository;

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
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group findOne(Integer groupId) {
        return groupRepository.findOne(groupId);
    }

    @Override
    public <S extends Group> S save(S group) {
        return groupRepository.save(group);
    }

    @Override
    public void delete(Integer groupId) {
        groupRepository.delete(groupId);
    }
}

package ua.com.vendigo.knutimetable.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knutimetable.group.Group;
import ua.com.vendigo.knutimetable.group.GroupRepository;

@RestController
@RequestMapping("/timetable")
public class TimeTableController {

    @Autowired
    GroupRepository groupRepository;
    @Autowired
    TimeTableCreator timeTableCreator;

    @RequestMapping(value = "/forGroup/{groupId}", method = RequestMethod.GET)
    TimeTable getFullTimeTableForGroup(@PathVariable Integer groupId) {
        Group group = groupRepository.findOne(groupId);

        return timeTableCreator.createTimeTable(group);
    }
}

package ua.com.vendigo.knurozklad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.faculty.Group;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
import ua.com.vendigo.knurozklad.service.faculty.GroupService;
import ua.com.vendigo.knurozklad.service.timetable.TimeTableService;
import ua.com.vendigo.knurozklad.util.TestDataHolder;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@RestController
@RequestMapping(value = "/")
public class GuestController {

    @Autowired
    TestDataHolder testDataHolder;
    @Autowired
    GroupService groupService;
    @Autowired
    TimeTableService timeTableService;

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    List<Faculty> getFaculties() {
        return testDataHolder.getFaculties();
    }

    @RequestMapping(value = "/faculty/{facultyId}", method = RequestMethod.GET)
    Faculty getFaculty(@PathVariable int facultyId) {
        return testDataHolder.getFaculty(facultyId);
    }

    @RequestMapping(value = "/group", method = RequestMethod.GET)
    List<Group> getAllGroups() {
        return groupService.findAllGroups();
    }

    @RequestMapping(value = "/group/{groupId}/actualTimeTable", method = RequestMethod.GET)
    TimeTable getActualTimeTableForGroup(@PathVariable int groupId) {
        return testDataHolder.getTimeTableForGroup(groupId);
    }

    //Test mappings

    @RequestMapping(value = "/persistdata", method = RequestMethod.GET)
    String persistData() {
        //Need to save all inner entities
        timeTableService.saveTimeTable(testDataHolder.getTimeTableForGroup(1));
        return "OK";
    }

    @RequestMapping(value = "/timetable", method = RequestMethod.GET)
    List<TimeTable> getTimeTables() {
        return timeTableService.findAllTimeTables();
    }
}
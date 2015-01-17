package ua.com.vendigo.knurozklad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
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

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    List<Faculty> getFaculties() {
        return testDataHolder.getFaculties();
    }

    @RequestMapping(value = "/faculty/{facultyId}", method = RequestMethod.GET)
    Faculty getFaculty(@PathVariable int facultyId) {
        return testDataHolder.getFaculty(facultyId);
    }

    @RequestMapping(value = "/group/{groupId}/actualTimeTable", method = RequestMethod.GET)
    TimeTable getActualTimeTableForGroup(@PathVariable int groupId) {
        return testDataHolder.getTimeTableForGroup(groupId);
    }
}
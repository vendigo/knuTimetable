package ua.com.vendigo.knurozklad.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.faculty.Group;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
import ua.com.vendigo.knurozklad.repository.GroupRepository;
import ua.com.vendigo.knurozklad.util.TestDataHolder;

import java.util.Date;
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
    GroupRepository groupService;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd,HH:00", timezone = "CET")
    Date date = new Date(2015, 1, 10);

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd,HH:00", timezone = "CET")
    LocalDate localDate = new LocalDate(2015, 1, 10);

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
        return groupService.findAll();
    }

    @RequestMapping(value = "/group/{groupId}/actualTimeTable", method = RequestMethod.GET)
    TimeTable getActualTimeTableForGroup(@PathVariable int groupId) {
        return testDataHolder.getTimeTableForGroup(groupId);
    }

    @RequestMapping(value = "/yodadate", method = RequestMethod.GET)
    LocalDate testYodaDate() {
        return localDate;
    }

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    Date testDate() {
        return date;
    }
}
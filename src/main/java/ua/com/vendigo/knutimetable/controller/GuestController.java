package ua.com.vendigo.knutimetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knutimetable.domain.faculty.Department;
import ua.com.vendigo.knutimetable.domain.faculty.Faculty;
import ua.com.vendigo.knutimetable.domain.faculty.Group;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.service.faculty.DepartmentService;
import ua.com.vendigo.knutimetable.service.faculty.FacultyService;
import ua.com.vendigo.knutimetable.service.faculty.GroupService;
import ua.com.vendigo.knutimetable.service.timetable.TimeTableService;
import ua.com.vendigo.knutimetable.util.TestDataHolder;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@RestController
@RequestMapping(value = "/")
public class GuestController {

    @Autowired
    TestDataHolder testDataHolder; //About to delete

    @Autowired
    FacultyService facultyService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    GroupService groupService;
    @Autowired
    TimeTableService timeTableService;

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    List<Faculty> getAllFaculties() {
        return facultyService.getAllFaculties();
    }

    @RequestMapping(value = "/faculty/{facultyId}", method = RequestMethod.GET)
    Faculty getFaculty(@PathVariable int facultyId) {
        return facultyService.getFacultyById(facultyId);
    }

    @RequestMapping(value = "/department/{departmentId}", method = RequestMethod.GET)
    Department getDepartment(@PathVariable int departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.GET)
    Group getGroup(@PathVariable int groupId) {
        return groupService.getGroupById(groupId);
    }

    @RequestMapping(value = "/group/{groupId}/actualTimeTable", method = RequestMethod.GET)
    TimeTable getActualTimeTableForGroup(@PathVariable int groupId) {
        return timeTableService.getActualTimeTableForGroup(groupId);
    }
}
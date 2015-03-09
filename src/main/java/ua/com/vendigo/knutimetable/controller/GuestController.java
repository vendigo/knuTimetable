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

import java.util.List;

@RestController
@RequestMapping(value = "/guest")
public class GuestController {

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
        return facultyService.findAll();
    }

    @RequestMapping(value = "/faculty/{facultyId}", method = RequestMethod.GET)
    Faculty getFaculty(@PathVariable int facultyId) {
        return facultyService.findOne(facultyId);
    }

    @RequestMapping(value = "/department/{departmentId}", method = RequestMethod.GET)
    Department getDepartment(@PathVariable int departmentId) {
        return departmentService.findOne(departmentId);
    }

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.GET)
    Group getGroup(@PathVariable int groupId) {
        return groupService.findOne(groupId);
    }

    @RequestMapping(value = "/group/{groupId}/actualTimeTable", method = RequestMethod.GET)
    TimeTable getActualTimeTableForGroup(@PathVariable int groupId) {
        return timeTableService.getActualTimeTableForGroup(groupId);
    }
}
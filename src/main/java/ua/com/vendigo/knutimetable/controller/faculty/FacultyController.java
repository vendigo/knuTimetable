package ua.com.vendigo.knutimetable.controller.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.vendigo.knutimetable.domain.faculty.Faculty;
import ua.com.vendigo.knutimetable.service.faculty.FacultyService;

import java.util.List;

@RestController
@RequestMapping(value = "faculty")
public class FacultyController {
    @Autowired
    FacultyService facultyService;

    @RequestMapping(method = RequestMethod.GET)
    List<Faculty> getAllFaculties() {
        return facultyService.findAll();
    }

    @RequestMapping(value = "/{facultyId}", method = RequestMethod.GET)
    Faculty getFacultyById(@PathVariable Integer facultyId) {
        return facultyService.findOne(facultyId);
    }

    @RequestMapping(method = RequestMethod.POST)
    void saveFaculty(@ModelAttribute("faculty") Faculty faculty) {
        facultyService.save(faculty);
    }

    @RequestMapping(value = "/{facultyId}", method = RequestMethod.DELETE)
    void deleteFaculty(@PathVariable Integer facultyId) {
        facultyService.delete(facultyId);
    }
}

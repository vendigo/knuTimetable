package ua.com.vendigo.knutimetable.service.faculty;

import ua.com.vendigo.knutimetable.domain.faculty.Faculty;

import java.util.List;

/**
 * Created by Dmytro Marchenko on 08.02.2015.
 */
public interface FacultyService {
    List<Faculty> getAllFaculties();
    Faculty getFacultyById(int facultyId);
}

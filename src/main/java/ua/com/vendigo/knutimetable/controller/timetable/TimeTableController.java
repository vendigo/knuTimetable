package ua.com.vendigo.knutimetable.controller.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;
import ua.com.vendigo.knutimetable.service.timetable.TimeTableService;
import ua.com.vendigo.knutimetable.utils.FlatTimeTableCreator;

@RestController
@RequestMapping(value = "timetable")
public class TimeTableController {

    @Autowired
    FlatTimeTableCreator flatTimeTableCreator;
    @Autowired
    TimeTableService timeTableService;

    @RequestMapping(value = "/flat/forGroup/{groupId}", method = RequestMethod.GET)
    FlatTimeTable getFlatTimeTableForGroup(@PathVariable Integer groupId) {
        return timeTableService.getFlatTimeTableForGroup(groupId);
    }

    @RequestMapping(value = "/full/forGroup/{groupId}", method = RequestMethod.GET)
    TimeTable getFullTimeTableForGroup(@PathVariable Integer groupId) {
        return timeTableService.getFullTimeTableForGroup(groupId);
    }
}

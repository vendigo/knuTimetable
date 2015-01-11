package ua.com.vendigo.knurozklad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;
import ua.com.vendigo.knurozklad.util.TestDataHolder;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@RestController
public class GuestController {

    @RequestMapping("/")
    TimeTable testData() {
        return new TestDataHolder().createTestTimeTable();
    }
}
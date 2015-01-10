package ua.com.vendigo.knurozklad.controller;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vendigo.knurozklad.domain.Group;
import ua.com.vendigo.knurozklad.domain.PairTime;
import ua.com.vendigo.knurozklad.domain.TimeSettings;
import ua.com.vendigo.knurozklad.domain.TimeTable;
import ua.com.vendigo.knurozklad.util.TestTimeTableCreator;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    TimeTable home() {

        return new TestTimeTableCreator().createTestTimeTable();
    }
}
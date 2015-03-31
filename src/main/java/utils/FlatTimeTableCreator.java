package utils;

import org.joda.time.LocalDate;
import ua.com.vendigo.knutimetable.domain.pair.FlatPair;
import ua.com.vendigo.knutimetable.domain.timetable.Day;
import ua.com.vendigo.knutimetable.domain.timetable.DayPairMapping;
import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates {@link ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable} from {@link ua.com.vendigo.knutimetable.domain.timetable.TimeTable}.
 */
public class FlatTimeTableCreator {
    public static FlatTimeTable createFlatTimeTable(TimeTable timeTable) {
        String groupName = timeTable.getGroup().getName();
        int courseNumber = timeTable.getGroup().getCourseNumber();
        boolean oddWeek = isOddWeek(timeTable);
        Map<DayOfWeek, Map<Integer, FlatPair>> pairs = createFlatPairs(timeTable);

        return new FlatTimeTable(groupName, courseNumber, pairs);
    }

    private static boolean isOddWeek(TimeTable timeTable) {
        LocalDate now = LocalDate.now();
        LocalDate oddWeekDate = timeTable.getTimeSettings().getOddWeekDate();

        //Determine whether currentWeek is Odd

        return false;
    }

    private static Map<DayOfWeek, Map<Integer, FlatPair>> createFlatPairs(TimeTable timeTable) {
        Map<DayOfWeek, Map<Integer, FlatPair>> resultMap = new HashMap<>();

        List<Day> days = timeTable.getDays();
        for (Day day : days) {
            List<DayPairMapping> dayPairMapping = day.getDayPairMappings();
            Map<Integer, FlatPair> dayFlatPairs = createDayFlatPairs(dayPairMapping);
            resultMap.put(day.getDayOfWeek(), dayFlatPairs);
        }

        return resultMap;
    }

    private static Map<Integer, FlatPair> createDayFlatPairs(List<DayPairMapping> dayPairMapping) {
        Map<Integer, FlatPair> resultMap = new HashMap<>();

        //Create flatPairs mapping

        return resultMap;
    }
}

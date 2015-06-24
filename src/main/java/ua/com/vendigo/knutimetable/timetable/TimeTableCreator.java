package ua.com.vendigo.knutimetable.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vendigo.knutimetable.group.Group;
import ua.com.vendigo.knutimetable.pair.Pair;
import ua.com.vendigo.knutimetable.pair.PairRepository;
import ua.com.vendigo.knutimetable.pair.SimplePair;
import ua.com.vendigo.knutimetable.pair.WeekStatus;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ua.com.vendigo.knutimetable.util.Validator.notNull;

@Component
public class TimeTableCreator {

    @Autowired
    PairRepository pairRepository;

    public TimeTable createTimeTable(Group group) {
        notNull(group, "group");

        int courseNumber = group.getCourseNumber();
        String groupName = group.getName();
        String groupDepartment = group.getDepartment();

        Map<DayOfWeek, Map<Integer, List<SimplePair>>> daysMap = new HashMap<>();
        List<Pair> pairs = pairRepository.findByGroup_Id(group.getId());
        for (Pair pair : pairs) {
            DayOfWeek dayOfWeek = pair.getDayOfWeek();
            Map<Integer, List<SimplePair>> day = getDayOrAddAndGet(daysMap, dayOfWeek);

            int numberOfPair = pair.getNumberOfPair();
            List<SimplePair> pairsByNumber = getPairsByNumberOrAddAndGet(day, numberOfPair);

            int weekIndex = getWeekIndex(pair);
            SimplePair simplePair = new SimplePair(pair);

            pairsByNumber.add(weekIndex, simplePair);
        }

        return new TimeTable(courseNumber, groupName, groupDepartment, daysMap);
    }

    private int getWeekIndex(Pair pair) {
        if (pair.getWeekStatus() == WeekStatus.ALWAYS || pair.getWeekStatus() == WeekStatus.ODD_WEEK) {
            return 0;
        } else {
            return 1;
        }
    }

    private List<SimplePair> getPairsByNumberOrAddAndGet(Map<Integer, List<SimplePair>> day, int numberOfPair) {
        List<SimplePair> pairsByNumber = day.get(numberOfPair);

        if (pairsByNumber == null) {
            pairsByNumber = new ArrayList<>();
            day.put(numberOfPair, pairsByNumber);
        }

        return pairsByNumber;
    }

    private Map<Integer, List<SimplePair>> getDayOrAddAndGet(Map<DayOfWeek, Map<Integer, List<SimplePair>>> daysMap, DayOfWeek dayOfWeek) {
        Map<Integer, List<SimplePair>> day = daysMap.get(dayOfWeek);

        if (day == null) {
            day = new HashMap<>();
            daysMap.put(dayOfWeek, day);
        }

        return day;
    }
}

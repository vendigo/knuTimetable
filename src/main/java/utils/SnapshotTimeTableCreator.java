package utils;

import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import ua.com.vendigo.knutimetable.domain.pair.FlatPair;
import ua.com.vendigo.knutimetable.domain.time.PairTime;
import ua.com.vendigo.knutimetable.domain.time.TimeSettings;
import ua.com.vendigo.knutimetable.domain.timetable.FlatTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.SnapshotTimeTable;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

import java.time.DayOfWeek;
import java.util.Map;

/**
 * Creates {@link ua.com.vendigo.knutimetable.domain.timetable.SnapshotTimeTable} from
 * {@link ua.com.vendigo.knutimetable.domain.timetable.TimeTable}
 */
public class SnapshotTimeTableCreator {

    public static final int NO_PAIR = -1;

    public static SnapshotTimeTable createSnapshotTimeTable(TimeTable timeTable) {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = DayOfWeek.of(now.getDayOfWeek());

        FlatTimeTable flatTimeTable = FlatTimeTableCreator.createFlatTimeTable(timeTable);
        Map<DayOfWeek, Map<Integer, FlatPair>> pairs = flatTimeTable.getPairs();
        Map<Integer, FlatPair> todayPairs = pairs.get(dayOfWeek);

        FlatPair currentPair = null;
        FlatPair nextPair = null;

        if (todayPairs != null) {
            int currentPairNumber = defineCurrentPairNumber(timeTable);
                int nextPairNumber = currentPairNumber + 1;
                currentPair = todayPairs.get(currentPairNumber);
                nextPair = todayPairs.get(nextPairNumber);
        }

        return new SnapshotTimeTable(currentPair, nextPair);
    }

    private static int defineCurrentPairNumber(TimeTable timeTable) {
        LocalTime time = LocalTime.now();

        TimeSettings timeSettings = timeTable.getTimeSettings();
        Map<Integer, PairTime> pairTimes = timeSettings.getPairTimes();
        for (Map.Entry<Integer, PairTime> pairTimeEntry : pairTimes.entrySet()) {
            PairTime pairTime = pairTimeEntry.getValue();
            if (time.isAfter(pairTime.getTimeBegin()) &&
                    time.isBefore(pairTime.getTimeEnd())) {
                return pairTimeEntry.getValue().getPairNumber();
            }
        }
        return NO_PAIR;
    }

}

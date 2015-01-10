package ua.com.vendigo.knurozklad.util;

import org.joda.time.LocalTime;
import ua.com.vendigo.knurozklad.domain.*;

import java.util.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * For test purposes. Should be deleted or moved to test folder.
 */
public class TestTimeTableCreator {
    public TimeTable createTestTimeTable() {
        //Time settings
        PairTime pair1Time = new PairTime(1, new LocalTime(8,40), new LocalTime(9,25), new LocalTime(9,30), new LocalTime(10,15));
        PairTime pair2Time = new PairTime(2, new LocalTime(10,35), new LocalTime(11,20), new LocalTime(11,25), new LocalTime(12,10));
        PairTime pair3Time = new PairTime(3, new LocalTime(12,20), new LocalTime(13,05), new LocalTime(13,10), new LocalTime(13,55));
        Map<Integer, PairTime> pairTimeMap = new HashMap<>();
        pairTimeMap.put(1, pair1Time);
        pairTimeMap.put(2, pair2Time);
        pairTimeMap.put(3, pair3Time);
        TimeSettings timeSettings = new TimeSettings(1, pairTimeMap);

        //Pairs creation
        Teacher nazarenko = new Teacher(1, "Назаренко Микола Олексійович", "Доцент кафедри математичного аналізу. Всі лекції переписує з книжки");
        Cabinet cabinet41 = new Cabinet(1, "42", "Велика лекційна аудиторія");
        Subject matan = new Subject(1, "Математичний аналіз", "Матан", "Базовий предмет мехмату", ExamType.EXAM);
        Pair matanLecture = new Pair(1, cabinet41, nazarenko, PairType.LECTURE);
        Map<Integer, List<Pair>> mondayPairs = new HashMap<>();
        mondayPairs.put(1, Arrays.asList(matanLecture));

        //Days creation
        Day monday = new Day(1, DayOfWeek.MONDAY, mondayPairs);
        List<Day> days = Arrays.asList(monday);

        Group group = new Group(1, 1, "Статистика", null);
        TimeTable timeTable = new TimeTable(1, group, timeSettings, days, 2014, 2);
        return timeTable;
    }
}

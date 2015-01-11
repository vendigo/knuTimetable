package ua.com.vendigo.knurozklad.util;

import ua.com.vendigo.knurozklad.domain.faculty.*;
import ua.com.vendigo.knurozklad.domain.pair.ExamType;
import ua.com.vendigo.knurozklad.domain.pair.Pair;
import ua.com.vendigo.knurozklad.domain.pair.PairType;
import ua.com.vendigo.knurozklad.domain.time.*;
import ua.com.vendigo.knurozklad.domain.timetable.Day;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * For test purposes. Should be deleted or moved to test folder.
 */
public class TestDataHolder {
    public TimeTable createTestTimeTable() {
        //Time settings
        PairTime pair1Time = new PairTime(1, new SimpleTime(8, 40), new SimpleTime(9, 25), new SimpleTime(9, 30), new SimpleTime(10, 15));
        PairTime pair2Time = new PairTime(2, new SimpleTime(10, 35), new SimpleTime(11, 20), new SimpleTime(11, 25), new SimpleTime(12, 10));
        PairTime pair3Time = new PairTime(3, new SimpleTime(12, 20), new SimpleTime(13, 05), new SimpleTime(13, 10), new SimpleTime(13, 55));
        Map<Integer, PairTime> pairTimeMap = new HashMap<>();
        pairTimeMap.put(1, pair1Time);
        pairTimeMap.put(2, pair2Time);
        pairTimeMap.put(3, pair3Time);
        TimeSettings timeSettings = new TimeSettings(1, pairTimeMap, new SimpleDate(2015, 3, 1));

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

        Group statistika = new Group(1, 1, "Статистика", null);
        Faculty mechmat = new Faculty(1, "Мехмат", "Механіко-математичний факультет", Arrays.asList(statistika), null);
        TimeTable timeTable = new TimeTable(1, statistika, timeSettings, days, 2014, 2, mechmat);
        return timeTable;
    }


}

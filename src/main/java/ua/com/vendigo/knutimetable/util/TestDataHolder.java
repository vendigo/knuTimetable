package ua.com.vendigo.knutimetable.util;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import ua.com.vendigo.knutimetable.domain.faculty.*;
import ua.com.vendigo.knutimetable.domain.pair.ExamType;
import ua.com.vendigo.knutimetable.domain.pair.Pair;
import ua.com.vendigo.knutimetable.domain.pair.PairType;
import ua.com.vendigo.knutimetable.domain.time.DayOfWeek;
import ua.com.vendigo.knutimetable.domain.time.PairTime;
import ua.com.vendigo.knutimetable.domain.time.TimeSettings;
import ua.com.vendigo.knutimetable.domain.timetable.Day;
import ua.com.vendigo.knutimetable.domain.timetable.DayPairMapping;
import ua.com.vendigo.knutimetable.domain.timetable.TimeTable;

import java.util.*;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * For test purposes. Should be deleted or moved to test folder.
 */
public class TestDataHolder {

    public static final int TEST_GROUP_ID = 1;

    private List<Faculty> faculties;
    private TimeTable stat1TimeTable;

    public TestDataHolder() {
        init();
    }

    private void init() {
        //Time settings
        PairTime pair1Time = new PairTime(1, new LocalTime(8, 40), new LocalTime(9, 25), new LocalTime(9, 30), new LocalTime(10, 15));
        PairTime pair2Time = new PairTime(2, new LocalTime(10, 35), new LocalTime(11, 20), new LocalTime(11, 25), new LocalTime(12, 10));
        PairTime pair3Time = new PairTime(3, new LocalTime(12, 20), new LocalTime(13, 05), new LocalTime(13, 10), new LocalTime(13, 55));
        Map<Integer, PairTime> pairTimeMap = new HashMap<>();
        pairTimeMap.put(1, pair1Time);
        pairTimeMap.put(2, pair2Time);
        pairTimeMap.put(3, pair3Time);
        TimeSettings timeSettings = new TimeSettings(pairTimeMap, new LocalDate(2015, 3, 1));

        //Pairs creation
        Teacher nazarenko = new Teacher("Назаренко Микола Олексійович", "Доцент кафедри математичного аналізу. Всі лекції переписує з книжки");
        Cabinet cabinet41 = new Cabinet("42", "Велика лекційна аудиторія");
        Cabinet cabinet302 = new Cabinet("302", "Кабінет на третьому поверсі");
        Subject matan = new Subject("Математичний аналіз", "Матан", "Базовий предмет мехмату", ExamType.EXAM);
        Pair matanLecture = new Pair(matan, cabinet41, nazarenko, PairType.LECTURE);
        Pair matanPractice = new Pair(matan, cabinet302, nazarenko, PairType.PRACTICE);
        
        
        //Days creation
        Day monday = new Day(DayOfWeek.MONDAY);
        List<DayPairMapping> mondayPairs = Arrays.asList(new DayPairMapping(monday, 1, matanLecture), new DayPairMapping(monday, 2, matanPractice), new DayPairMapping(monday, 3, matanPractice));
        monday.setDayPairMapping(mondayPairs);

        Day tuesday = new Day(DayOfWeek.TUESDAY);
        List<DayPairMapping> tuesdayPairs = Arrays.asList(new DayPairMapping(tuesday, 1, matanLecture), new DayPairMapping(tuesday, 2, matanPractice), new DayPairMapping(tuesday, 3, matanPractice));
        tuesday.setDayPairMapping(tuesdayPairs);

        Day wednesday = new Day(DayOfWeek.WEDNESDAY);
        List<DayPairMapping> wednesdayPairs = Arrays.asList(new DayPairMapping(wednesday, 1, matanLecture), new DayPairMapping(wednesday, 2, matanPractice), new DayPairMapping(wednesday, 3, matanPractice));
        wednesday.setDayPairMapping(wednesdayPairs);

        Day thursday = new Day(DayOfWeek.THURSDAY);
        List<DayPairMapping> thursdayPairs = Arrays.asList(new DayPairMapping(thursday, 1, matanLecture), new DayPairMapping(thursday, 2, matanPractice), new DayPairMapping(thursday, 3, matanPractice));
        thursday.setDayPairMapping(thursdayPairs);

        Day friday = new Day(DayOfWeek.FRIDAY);
        List<DayPairMapping> fridayPairs = Arrays.asList(new DayPairMapping(friday, 1, matanLecture), new DayPairMapping(friday, 2, matanPractice), new DayPairMapping(friday, 3, matanPractice));
        friday.setDayPairMapping(fridayPairs);

        List<Day> days = Arrays.asList(monday, tuesday, wednesday, thursday, friday);


        Department tvDepartment = new Department("ТВ", "Теорія імовірності");

        Group statistika1 = new Group(1, "Статистика", null);
        Group math11 = new Group(1, "1 група математики", null);
        Group math12 = new Group(1, "2 група математики", null);
        Group math21 = new Group(2, "1 група математики", null);
        Group math22 = new Group(2, "2 група математики", null);
        Group statistika2 = new Group(3, "Статистика", tvDepartment);

        List<Group> mechmatGroups = Arrays.asList(statistika1, math11, math12, math21, math22, statistika2);

        Faculty mechmat = new Faculty("Мехмат", "Механіко-математичний факультет", mechmatGroups, Collections.<Department>emptyList());
        Faculty rff = new Faculty("РФФ", "Радіо-фізичний факультет", Collections.<Group>emptyList(), Collections.<Department>emptyList());
        Faculty fizfak = new Faculty("Фізфак", "Фізичний факультет", Collections.<Group>emptyList(), Collections.<Department>emptyList());

        faculties = Arrays.asList(mechmat, rff, fizfak);
        stat1TimeTable = new TimeTable(statistika1, timeSettings, days, 2014, 2, mechmat);
    }

    public TimeTable getTimeTableForGroup(int groupId) {
        if (groupId == TEST_GROUP_ID) return stat1TimeTable;
        return null;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public Faculty getFaculty(int facultyId) {
        return faculties.get(facultyId - 1);
    }

}

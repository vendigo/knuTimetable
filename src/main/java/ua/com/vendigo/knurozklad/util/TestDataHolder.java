package ua.com.vendigo.knurozklad.util;

import ua.com.vendigo.knurozklad.domain.faculty.Faculty;
import ua.com.vendigo.knurozklad.domain.timetable.TimeTable;

import java.util.List;

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
        /*//Time settings
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
        Cabinet cabinet302 = new Cabinet(2, "302", "Кабінет на третьому поверсі");
        Subject matan = new Subject(1, "Математичний аналіз", "Матан", "Базовий предмет мехмату", ExamType.EXAM);
        Pair matanLecture = new Pair(1, matan, cabinet41, nazarenko, PairType.LECTURE);
        Pair matanPractice = new Pair(2, matan, cabinet302, nazarenko, PairType.PRACTICE);
        Map<Integer, List<Pair>> pairs = new HashMap<>();
        pairs.put(1, Arrays.asList(matanLecture));
        pairs.put(2, Arrays.asList(matanPractice));
        pairs.put(3, Arrays.asList(matanPractice));

        //Days creation
        Day monday = new Day(1, DayOfWeek.MONDAY, pairs);
        Day tuesday = new Day(2, DayOfWeek.TUESDAY, pairs);
        Day wednesday = new Day(3, DayOfWeek.WEDNESDAY, pairs);
        Day thursday = new Day(4, DayOfWeek.THURSDAY, pairs);
        Day friday = new Day(5, DayOfWeek.FRIDAY, pairs);
        List<Day> days = Arrays.asList(monday, tuesday, wednesday, thursday, friday);


        Group statistika1 = new Group(1, 1, "Статистика", null);
        Group math11 = new Group(2, 1, "1 група математики", null);
        Group math12 = new Group(3, 1, "2 група математики", null);
        Group math21 = new Group(4, 2, "1 група математики", null);
        Group math22 = new Group(5, 2, "2 група математики", null);
        Group statistika2 = new Group(6, 2, "Статистика", null);

        List<Group> mechmatGroups = Arrays.asList(statistika1, math11, math12, math21, math22, statistika2);

        Faculty mechmat = new Faculty(1, "Мехмат", "Механіко-математичний факультет", mechmatGroups, Collections.<Department>emptyList());
        Faculty rff = new Faculty(1, "РФФ", "Радіо-фізичний факультет", Collections.<Group>emptyList(), Collections.<Department>emptyList());
        Faculty fizfak = new Faculty(1, "Фізфак", "Фізичний факультет", Collections.<Group>emptyList(), Collections.<Department>emptyList());

        faculties = Arrays.asList(mechmat, rff, fizfak);
        stat1TimeTable = new TimeTable(1, statistika1, timeSettings, days, 2014, 2, mechmat);*/
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

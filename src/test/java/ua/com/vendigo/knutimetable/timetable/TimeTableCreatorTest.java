package ua.com.vendigo.knutimetable.timetable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ua.com.vendigo.knutimetable.group.Group;
import ua.com.vendigo.knutimetable.pair.*;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TimeTableCreatorTest {
    @Mock
    PairRepository pairRepository;

    @Test
    public void testCreateTimeTable() throws Exception {
        Group group1 = new Group(1, null, 1, "1st group", "Department1", null);

        Pair pair1 = new Pair(group1, WeekStatus.ALWAYS, DayOfWeek.MONDAY, 1, "Subject1", PairType.PRACTICE, ExamType.PASS_FAIL,
                "Teacher1", "101");
        Pair pair2 = new Pair(group1, WeekStatus.ALWAYS, DayOfWeek.MONDAY, 2, "Subject2", PairType.MIXED, ExamType.UNKNOWN,
                "Teacher2", "102");
        Pair pair3 = new Pair(group1, WeekStatus.EVEN_WEEK, DayOfWeek.MONDAY, 3, "Subject3", PairType.LECTURE, ExamType.EXAM,
                "Teacher3", "101");
        Pair pair4 = new Pair(group1, WeekStatus.ODD_WEEK, DayOfWeek.MONDAY, 3, "Subject4", PairType.PRACTICE, ExamType.EXAM,
                "Teacher3", "101");

        when(pairRepository.findByGroup_Id(1)).thenReturn(Arrays.asList(pair1, pair2, pair3, pair4));

        TimeTableCreator timeTableCreator = new TimeTableCreator();
        timeTableCreator.pairRepository = pairRepository;

        TimeTable timeTable = timeTableCreator.createTimeTable(group1);

        assertThat(timeTable.getCourseNumber(), is(1));
        assertThat(timeTable.getGroupName(), is("1st group"));
        assertThat(timeTable.getGroupDepartment(), is("Department1"));
        assertThat(timeTable.getDays().size(), is(1));

        List<SimplePair> pairs1 = Arrays.asList(new SimplePair(pair1), null);
        List<SimplePair> pairs2 = Arrays.asList(new SimplePair(pair2), null);
        List<SimplePair> pairs3 = Arrays.asList(new SimplePair(pair4), new SimplePair(pair3));
        Map<Integer, List<SimplePair>> expectedMondayPairs = new HashMap<>();
        expectedMondayPairs.put(1, pairs1);
        expectedMondayPairs.put(2, pairs2);
        expectedMondayPairs.put(3, pairs3);

        Map<Integer, List<SimplePair>> mondayPairs = timeTable.getDays().get(DayOfWeek.MONDAY);

        assertThat(mondayPairs, equalTo(expectedMondayPairs));
    }

}

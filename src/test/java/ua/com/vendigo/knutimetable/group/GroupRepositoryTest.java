package ua.com.vendigo.knutimetable.group;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ua.com.vendigo.knutimetable.Launcher;
import ua.com.vendigo.knutimetable.faculty.Faculty;
import ua.com.vendigo.knutimetable.faculty.FacultyRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Launcher.class)
@WebAppConfiguration
@IntegrationTest
public class GroupRepositoryTest {
    @Autowired
    FacultyRepository facultyRepository;
    @Autowired
    GroupRepository groupRepository;

    @Test
    public void testCreateNewGroupWithoutFaculty() throws Exception {
        Group group = new Group(1, null, 1, "1st Group", null, null);
        groupRepository.save(group);

        assertThat(group.getId(), notNullValue());
    }

    @Test
    public void testCreateNewGroupWithFaculty() throws Exception {
        Faculty faculty = facultyRepository.findOne(1);
        Group group = new Group(1, faculty, 1, "1st Group", null, null);
        groupRepository.save(group);

        assertThat(group.getId(), notNullValue());
    }
}

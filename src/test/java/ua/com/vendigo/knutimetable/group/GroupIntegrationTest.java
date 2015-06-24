package ua.com.vendigo.knutimetable.group;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ua.com.vendigo.knutimetable.Launcher;

import static com.jayway.restassured.RestAssured.when;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Launcher.class)
@WebAppConfiguration
@IntegrationTest
public class GroupIntegrationTest {

    @Test
    public void testFindAllGroups() {
        when().
                get("/groups").
                then().
                statusCode(HttpStatus.SC_OK);
    }
}

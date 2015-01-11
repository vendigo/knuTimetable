package ua.com.vendigo.knurozklad.domain;

import org.junit.Test;
import ua.com.vendigo.knurozklad.domain.time.SimpleTime;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 */
public class SimpleTimeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFailsWrongMinutes() throws Exception {
        new SimpleTime(12, 66);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFailsWrongHours() throws Exception {
        new SimpleTime(28, 2);
    }
}

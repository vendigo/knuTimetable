package ua.com.vendigo.knurozklad.domain;

import org.junit.Test;
import ua.com.vendigo.knurozklad.domain.time.SimpleDate;

/**
 * Created by Dmytro Marchenko on 11.01.2015.
 */
public class SimpleDateTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFailsNegativeYear() throws Exception {
        new SimpleDate(-5, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFailsWrongMonth() throws Exception {
        new SimpleDate(2014, 13, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFailsWrongDay() throws Exception {
        new SimpleDate(2014, 2, 30);
    }
}

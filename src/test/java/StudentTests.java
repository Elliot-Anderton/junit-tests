import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
public class StudentTests {
    private Student jeff;

    @Before
    public void setJeff() {
        jeff = new Student(9, "Jeff");

        jeff.addGrade(4);
        jeff.addGrade(5);
        jeff.addGrade(3);
    }

    @Test
    public void testConstructor() {
        assertNotNull(jeff);
    }

    @Test
    public void testgetId() {
        assertEquals(9, jeff.getId(), 0);
    }

    @Test
    public void testgetName() {
        assertEquals("Jeff", jeff.getName());
    }

    @Test
    public void testaddGrade() {
        ArrayList<Integer> expected= new ArrayList<>();
        expected.add(4);
        expected.add(5);
        expected.add(3);

        assertEquals(expected, jeff.getGrades());
    }

    @Test
    public void testgetGradeAverage() {

        assertEquals(4, jeff.getGradeAverage());
    }
}

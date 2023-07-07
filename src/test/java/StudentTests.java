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
        jeff.addGrade(76);
        jeff.addGrade(82);
        jeff.addGrade(56);

        ArrayList<Integer> expected= new ArrayList<>();
        expected.add(76);
        expected.add(82);
        expected.add(56);

        assertEquals(expected, jeff.getGrades());
    }
}

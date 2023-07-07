import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Student student;

     @Before
    public void setUo() {
         cohort.addStudent(student = new Student(9L, "Jeff"));
     }

     @Test
    public void testAddStudent(){
         assertEquals("Jeff", student.getName());
    }
}

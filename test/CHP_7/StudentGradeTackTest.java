package CHP_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTackTest {
 StudentGradeTack test;
    @BeforeEach
    void setUp() {
        test = new StudentGradeTack(30,10);
    }
    @Test
    void testArrayExist(){
        assertNotNull(test);
    }
    @Test
    void testStudentHasAName(){
        test.enterStudentName(0,"Joshua White");
        test.enterStudentName(1, "Whitney Yellow");

    }

}
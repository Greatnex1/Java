package MyPractices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear yearWheel;
    @BeforeEach
    void setup(){
        yearWheel = new LeapYear();

    }
    @Test
    void testForALeapYear(){
        boolean year = yearWheel.leap(2003);
        System.out.println(year);
        assertFalse(yearWheel.leap(2002));
//        int result = yearWheel.leapYear(2008);
//        assertEquals(2008, result );
////       assertEquals(yearWheel.leapYear(2006));


    }


}
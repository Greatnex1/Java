package tdd;

import ExcerciseThree.Heart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HeartTest {
    Heart win;
    @BeforeEach
    void setUp(){

         win = new Heart("Joe", "Akin", "Jan", 12, 1994, 38, 39);

    }
    @Test
    public void testMaximumHeartRate(){
        win.setMaximumHeartRate(35);
        int beat = win.getMaximumHeartRate();
        assertEquals(35,beat);
    }
    @Test
    public void testTargetRate(){
        win.setTargetRate(29);
        int tar = win.getTargetRate();
        assertEquals(29, tar);
    }
    @Test
    public void testFirstName(){
        win.setFirstName(" ");
        String nae = win.getFirstName();
        assertNull( null, nae);
    }
    @Test
    public void testYear(){
        win.setYear(1999);
        assertEquals(23, win.getYear() );
    }
}

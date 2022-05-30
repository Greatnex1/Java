package tdd;

import ExcerciseThree.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockSpec {
    Clock test;
    @BeforeEach
    void move(){
        test = new Clock(25, 45,36);
    }
@Test
  public void testHour(){
        int hour = 25;
            test.setHour(hour);
            int rest = test.getHour();
            assertEquals(0, rest);

}
@Test
    public void setMinute(){
        int minute = 45;
        test.setMinute(minute);
        int div = test.getMinute();
        assertEquals(45, div);
}
@Test
    public void setSecond(){
        int second = 36;
        test.setSecond(second);
        int bill = test.getSecond();
        assertEquals(36, bill);
}
}

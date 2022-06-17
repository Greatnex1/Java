package MyPractices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Largest_Number_Test {
    LargestNumberCalculator test;

    @BeforeEach
    void up(){
        test = new LargestNumberCalculator();
    }
    @Test
    public void testLargestNumber(){
        int result = test.calculateLargest(6,5,3);
        assertEquals(6,result);
    }
}

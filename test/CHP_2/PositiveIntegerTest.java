package CHP_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveIntegerTest {
    PositiveIntegerMethod  test;
    @BeforeEach
    void down(){
        test = new PositiveIntegerMethod();
    }
    @Test
     public void testPositiveIntegerEvenAndOdd(){
        String positive = test.calculatePositiveInteger(8);
        assertEquals("odd", positive);
    }

}

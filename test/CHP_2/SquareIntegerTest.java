package CHP_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareIntegerTest {

    @Test
    void doubleNumber() {
        int number = 2;
        int answer =  number * number;
     assertEquals(4,answer);
    }
}